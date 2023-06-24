package repositories;

import entities.AdditionalMaterials;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BaseRepo extends AbstractRepo{

    public static List<AdditionalMaterials> gatAllMaterials() {
        try {
            final String sql = "SELECT * FROM add_materials";
            try (Connection conn = createCon();
                 Statement statement = conn.createStatement()) {
                final ResultSet resultSet = statement.executeQuery(sql);

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
}
