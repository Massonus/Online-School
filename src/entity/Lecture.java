package entity;

public class Lecture {
    private int id;

    public String courseId;
    public static int count;

    public Lecture(int id, String courseId) {
        this.id = id;
        this.courseId = courseId;
        count++;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", courseId='" + courseId + '\'' +
                '}';
    }





}
