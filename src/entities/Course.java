package entities;

import java.util.Comparator;
import java.util.Objects;

public class Course implements Comparator<Course> {

    private Integer id;

    private String name;
    public Course() {
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;

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

