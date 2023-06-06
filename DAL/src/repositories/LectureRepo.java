package repositories;

import entities.Lecture;

public class LectureRepo implements AboutRepo {

    private static Lecture[] lectures;

    public static Lecture[] getLectures() {
        return lectures;
    }

    public static void createLectureMas(final int length) {
        if (lectures != null && lectures.length > 0) {
            return;
        }
        lectures = new Lecture[length];
    }

    @Override
    public void getIt() {
        for (Lecture lecture : lectures) {
            System.out.println(lecture);
        }
    }

    @Override
    public void add() {

        if (lectures != null && lectures.length > 0) {
            if (lectures[0] != null) {
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
