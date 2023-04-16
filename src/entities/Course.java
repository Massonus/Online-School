package entities;

public class Course {

    private Integer id;

    private String name;

    private Student student;
    private Teacher teacher;
    private Lecture lecture;

    public Course() {
    }

    public Course(int id, String name, Student student, Teacher teacher, Lecture lecture) {
        this.id = id;
        this.name = name;
        this.student = student;
        this.teacher = teacher;
        this.lecture = lecture;
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

    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}

