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

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", courseId='" + courseId + '\'' +
                '}';
    }





}
