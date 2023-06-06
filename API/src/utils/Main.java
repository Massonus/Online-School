package utils;

import utils.AddController;
import utils.Controller;
import utils.CourseUtils;
import utils.LectureUtils;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.Console();

        LectureUtils lectureUtils = new LectureUtils();
        lectureUtils.CreateLectures();

        CourseUtils courseUtils = new CourseUtils();
        courseUtils.CreateCourse();

        AddController addController = new AddController();
        addController.Menu();


    }
}
