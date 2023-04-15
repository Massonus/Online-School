package repositories;

import entities.Teacher;

public class TeacherRepo implements AboutRepo {

    private static Teacher[] teachers;

    public static Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public void getIt() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public void add() {

        if (teachers != null && teachers.length > 0) {
            if (teachers[0] != null) {
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
