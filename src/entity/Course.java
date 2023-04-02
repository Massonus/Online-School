package entity;

public class Course extends University {

    public Course(int id, String name) {
        super(id, name);

    }

    public Course() {
    }

    private Student student;
    private Teacher teacher;
    private Lecture lecture;



}
