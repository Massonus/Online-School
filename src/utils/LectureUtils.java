package utils;

import entity.Lecture;

public class LectureUtils {

    Lecture lecture;

    public void printLecture(Lecture lecture) {
        System.out.println("\nFull sixth lecture: " + lecture);
        System.out.println("\nOnly id of sixth lecture: " + lecture.getId() + "\n");
    }


}

