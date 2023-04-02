package utils;

import entity.Lecture;

public class LectureUtils {

    public void CreateLectures() {
        Lecture lecture = new Lecture(1, "Math");
        Lecture lecture1 = new Lecture(2, "Physics");
        Lecture lecture2 = new Lecture(3, "Ukrainian");

    }

    Lecture lecture;

    public void printLecture(Lecture lecture) {
        System.out.println("\nFull sixth lecture: " + lecture);
        System.out.println("\nOnly id of sixth lecture: " + lecture.getId() + "\n");
    }


}

