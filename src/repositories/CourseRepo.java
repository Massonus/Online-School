package repositories;

import entity.Course;
import entity.University;

public class CourseRepo extends UniversityRepo {

    private static Course[] courses;

    public static Course[] getCourses() {
        return courses;
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
