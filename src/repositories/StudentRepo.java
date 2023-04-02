package repositories;

import entity.Student;
import entity.University;

public class StudentRepo extends UniversityRepo {

    private static Student[] students;

    public static Student[] getStudents() {
        return students;
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
