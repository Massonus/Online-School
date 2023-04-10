import repositories.LectureRepo;
import entity.Lecture;
import utils.CourseUtils;
import utils.LectureUtils;
import utils.Utils;

public class Main {
    public static void main(String[] args) {

        LectureRepo.createLectureMas(5);

        final Lecture[] lectures = LectureRepo.getLectures();

        LectureUtils lectureUtils = new LectureUtils();
        lectureUtils.CreateLectures();

        System.out.println("Sum of Lectures: " + Lecture.count);

        CourseUtils courseUtils = new CourseUtils();
        courseUtils.CreateCourse();

        Utils utils = new Utils();
        utils.Console();





    }
}
