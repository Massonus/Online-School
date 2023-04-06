package repositories;

import entity.Lecture;
import entity.University;

public class LectureRepo extends UniversityRepo {

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
    public void getAll() {
        super.getAll();
    }

    @Override
    public void add(University university) {
        super.add(university);
    }

    @Override
    public void getByld() {
        super.getByld();
    }

    @Override
    public void deleteByld() {
        super.deleteByld();
    }
}
