package entities;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import utils.LectureUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
@Entity
public class Lecture implements Serializable {

    public static LocalDateTime creationDate = LocalDateTime.now();
    public static LocalDateTime lectureDate = LocalDateTime.now();
    public static int count;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;

    private String name;

    private String description;

    private String date;

    private Teacher teacher;

    private LectureUtils lectureUtils;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    @ToString.Exclude
    private Course course;

    public Lecture() {
    }

    public Lecture(Integer personId, String name, String description, String date, Teacher teacher) {
        this.personId = personId;
        this.name = name;
        this.description = description;
        this.date = date;
        this.teacher = teacher;
        count++;
    }
    @Autowired
    public void setLectureUtils(LectureUtils lectureUtils) {
        this.lectureUtils = lectureUtils;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return Objects.equals(personId, lecture.personId) && Objects.equals(name, lecture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, name);
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
