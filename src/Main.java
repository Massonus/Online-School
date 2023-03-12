import utils.LectureUtils;

public class Main {
    public static void main(String[] args) {

        LectureUtils lectures = new LectureUtils();
        lectures.num = 1;
        lectures.course = "second";
        lectures.subject = "Math";

        LectureUtils lectures1 = new LectureUtils();
        lectures1.num = 2;
        lectures1.course = "third";
        lectures1.subject = "English";

        LectureUtils lectures2 = new LectureUtils();
        lectures2.num = 3;
        lectures2.course = "first";
        lectures2.subject = "Physic";

        LectureUtils lectures3 = new LectureUtils();

        System.out.println(LectureUtils.count);

    }
}
