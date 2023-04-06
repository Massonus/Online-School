package Repositories;

import entity.Lecture;

public class LectureRepo {

    public static Lecture[] lectures;

    public static void createLectureMas(final int length) {
        if (lectures != null && lectures.length > 0) {
            return;
        }
        lectures = new Lecture[length];
    }

}
