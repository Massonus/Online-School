package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utils.HomeworkUtils;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
@Component
public class Homework implements Serializable {

    public static LocalDateTime deadline = LocalDateTime.now().plusHours(19);
    private Integer lectureId;
    private String task;

    private HomeworkUtils homeworkUtils;
    public Homework() {
    }

    public Homework(Integer lectureId, String task) {
        this.lectureId = lectureId;
        this.task = task;
    }
    @Autowired
    public void setHomeworkUtils(HomeworkUtils homeworkUtils) {
        this.homeworkUtils = homeworkUtils;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "lectureId=" + lectureId +
                ", task='" + task + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homework homework = (Homework) o;
        return lectureId.equals(homework.lectureId) && task.equals(homework.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lectureId, task);
    }
}
