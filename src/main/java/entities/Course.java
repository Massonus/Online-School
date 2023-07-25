package entities;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import utils.CourseUtils;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;


@Entity
public class Course implements Comparator<Course> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private CourseUtils courseUtils;

    @OneToMany(mappedBy = "course",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @ToString.Exclude
    private List<Lecture> lectures = new ArrayList<>();

    public Course() {
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Autowired
    public void setCourseUtils(CourseUtils courseUtils) {
        this.courseUtils = courseUtils;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id.equals(course.id) && name.equals(course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compare(Course o1, Course o2) {
        return this.name.compareTo(o1.name);
    }
}

