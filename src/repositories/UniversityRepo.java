package repositories;

import entity.Additional;
import entity.University;

public class UniversityRepo {

    private static University [] universities;
    public void getAll () {
        System.out.println(AdditionalRepo.getAdditionals());
        System.out.println(CourseRepo.getCourses());
        System.out.println(HomeworkRepo.getHomeworks());
        System.out.println(LectureRepo.getLectures());
        System.out.println(StudentRepo.getStudents());
        System.out.println(TeacherRepo.getTeachers());
    }

    public void add (University university) {
        if (universities != null && universities.length > 0) {
            if (universities[0] != null) {
                System.out.println("Exist");
                return;
            }
        } else {
            System.out.println("Error");
        }

    }

    public void getByld () {

    }
    public void deleteByld () {

    }

}
