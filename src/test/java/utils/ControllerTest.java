package utils;

import entities.AdditionalMaterials;
import entities.Lecture;
import entities.Teacher;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ControllerTest {

    private Controller target;
    private final Map<Teacher, List<Lecture>> teacherListMap = new HashMap<>();
    private final Map<Lecture, List<AdditionalMaterials>> lectureListMap = new HashMap<>();

    List<Lecture> lectures1 = new ArrayList<>();

    @Test
    void sortLecturesByTeacher() {
        Lecture lecture = new Lecture(1, "John", "Uk", "20.05.2023", new Teacher());
        Lecture lecture1 = new Lecture(2, "Tim", "Geo", "21.05.2023", new Teacher());
        Lecture lecture2 = new Lecture(3, "Maks", "Math", "19.05.2023", new Teacher());
        Lecture lecture3 = new Lecture(4, "Lis", "Eng", "20.05.2023", new Teacher());

        Teacher teacher = new Teacher();


        lectures1.add(lecture);
        lectures1.add(lecture1);
        lectures1.add(lecture2);
        lectures1.add(lecture3);

        teacherListMap.put(teacher, lectures1);

        final Set<Map.Entry<Teacher, List<Lecture>>> listMap = target.sortLecturesByTeacher(lectures1);

        assertThat(listMap).isUnmodifiable();
    }

}