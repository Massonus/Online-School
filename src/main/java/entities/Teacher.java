package entities;

import org.springframework.beans.factory.annotation.Autowired;
import utils.TeacherUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
@Entity
public class Teacher implements Comparator<Teacher>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private TeacherUtils teacherUtils;

    public Teacher(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Autowired
    public void setTeacherUtils(TeacherUtils teacherUtils) {
        this.teacherUtils = teacherUtils;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Teacher() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return lastName.equals(teacher.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return this.lastName.compareTo(o1.lastName);
    }
}
