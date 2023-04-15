package repositories;

import entity.Student;

public class StudentRepo implements AboutRepo{

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
