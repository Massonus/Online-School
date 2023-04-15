package repositories;

import entity.Course;

public class CourseRepo implements AboutRepo {

    private static Course[] courses;

    public static Course[] getCourses() {
        return courses;
    }
    @Override
    public void getIt() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    @Override
    public void add() {

        if (courses != null && courses.length > 0) {
            if (courses[0] != null) {
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
