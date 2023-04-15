package utils;

import entities.Lecture;

public class LectureUtils {

    public void CreateLectures() {
        Lecture lecture = new Lecture();
        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture();

    }

    Lecture lecture;

    public void printLecture(Lecture lecture) {
        System.out.println("\nFull sixth lecture: " + lecture);
        System.out.println("\nOnly id of sixth lecture: " + lecture.getPersonId() + "\n");
    }


}

