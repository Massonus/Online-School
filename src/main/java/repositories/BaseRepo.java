package repositories;

import entities.AdditionalMaterials;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BaseRepo extends AbstractRepo{

    public static List<AdditionalMaterials> CallableStatement() {
        try {
            final String sql = "SELECT * FROM add_materials";
            try (Connection conn = createCon();
                 PreparedStatement prepareStatement = conn.prepareStatement(sql)) {
                 conn.setAutoCommit(false);
                final ResultSet resultSet = prepareStatement.executeQuery();

                final List<AdditionalMaterials> materials = new ArrayList<>();

                while (resultSet.next()) {
                    AdditionalMaterials additionalMaterials = new AdditionalMaterials();
                    additionalMaterials.setId(resultSet.getInt("id"));
                    additionalMaterials.setName(resultSet.getString("name"));
                    additionalMaterials.setBook(resultSet.getString("book"));
                    additionalMaterials.setUrl(resultSet.getString("url"));
                    additionalMaterials.setVideo(resultSet.getString("video"));
                    materials.add(additionalMaterials);
                }

                return materials;
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
        throw new IllegalArgumentException();
    }

    public static void insertColumns() {
        try {
            String insertQuery = "INSERT INTO public.add_materials( id, name, url, video, book) VALUES (?, ?, ?, ?, ?);";

            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)) {
                conn.setAutoCommit(false);

                preparedStatement.setInt(1, 21);
                preparedStatement.setString(2, "Mat 1");
                preparedStatement.setString(3,"video 1");
                preparedStatement.setString(4,"book 1");
                preparedStatement.setString(5, "Url 1");

                preparedStatement.addBatch();

                preparedStatement.setInt(1, 46);
                preparedStatement.setString(2, "Mat 2");
                preparedStatement.setString(3,"video 2");
                preparedStatement.setString(4,"book 2");
                preparedStatement.setString(5, "Url 2");

                preparedStatement.addBatch();

                int[] result = preparedStatement.executeBatch();

                conn.commit();

                System.out.println("add Lines Device: " + result);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }
}
