package utils;

import entities.Lecture;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public static <T> List<T> filter(List<T> list, Predicate<T> func) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (func.test(t))
                result.add(t);
        }
        return result;
    }

    public void formatDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
        String formatDateTime = Lecture.creationDate.format(formatter);
        System.out.println(formatDateTime);
    }


}

