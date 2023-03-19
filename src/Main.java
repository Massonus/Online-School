import entity.Lecture;
import utils.CourseUtils;
import utils.LectureUtils;

public class Main {
    public static void main(String[] args) {
        LectureUtils lectureUtils = new LectureUtils();
        Lecture lectures = new Lecture(1, "Math");
        Lecture lectures1 = new Lecture(2, "English");
        Lecture lectures2 = new Lecture(3, "Physics");
        Lecture lectures3 = new Lecture(4, "Geographic");
        Lecture lectures4 = new Lecture(5, "Ukrainian");
        Lecture lectures5 = new Lecture(6, "Chemistry");

        System.out.println("Sum of Lectures: " + Lecture.count);
        lectureUtils.printLecture(lectures5);

        CourseUtils courseUtils = new CourseUtils();
        courseUtils.Console();

    }
}
