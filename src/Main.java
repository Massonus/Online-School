import entities.Lecture;
import repositories.LectureRepo;
import utils.AddController;
import utils.Controller;
import utils.CourseUtils;
import utils.LectureUtils;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.Console();

        LectureRepo.createLectureMas(5);

        final Lecture[] lectures = LectureRepo.getLectures();

        LectureUtils lectureUtils = new LectureUtils();
        lectureUtils.CreateLectures();

        System.out.println("Sum of Lectures: " + Lecture.count);

        CourseUtils courseUtils = new CourseUtils();

        courseUtils.CreateCourse();

        AddController addController = new AddController();
        addController.Menu();


    }
}
