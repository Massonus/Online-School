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

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}

