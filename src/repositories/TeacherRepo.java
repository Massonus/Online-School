package repositories;

import entity.Teacher;
import entity.University;

public class TeacherRepo extends UniversityRepo {

    private static Teacher[] teachers;

    public static Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public void getAll() {
        super.getAll();
    }

    @Override
    public void add(University university) {
        super.add(university);
    }

    @Override
    public void getByld() {
        super.getByld();
    }

    @Override
    public void deleteByld() {
        super.deleteByld();
    }
}
