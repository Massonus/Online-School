import entities.Lecture;
import repositories.LectureRepo;
import utils.CourseUtils;
import utils.LectureUtils;
import utils.Utils;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.Console();

        LectureRepo.createLectureMas(5);

        final Lecture[] lectures = LectureRepo.getLectures();


        LectureUtils lectureUtils = new LectureUtils();
        lectureUtils.CreateLectures();

        System.out.println("Sum of Lectures: " + Lecture.count);

        CourseUtils courseUtils = new CourseUtils();
        courseUtils.CreateCourse();


    }
}
