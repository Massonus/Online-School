package repositories;

import entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class StudentRepo extends AbstractRepo implements AboutRepo {

    public static Student getStudentByName(String name) {
        Student student = new Student();
        try {
            String sql = "SELECT * FROM students WHERE name = ?";
            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, name);
                ResultSet resultSet = preparedStatement.executeQuery();
                resultSet.next();
                student.setId(resultSet.getInt("s_id"));
                student.setFirstName(resultSet.getString("john"));
                student.setLastName(resultSet.getString("invo"));
                return student;
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
        return null;
    }

    private static Student[] students;

    public static Student[] getStudents() {
        return students;
    }

    @Override
    public void getIt() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void add() {

        if (students != null && students.length > 0) {
            if (students[0] != null) {
                System.out.println("Exist");
                return;
            }
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void getByld() {

    }

    @Override
    public void deleteByld() {

    }
}
