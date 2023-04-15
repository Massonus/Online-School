package entities;

public class Homework {
    private int id;

    private String lectureId;

    private String task;

    public Homework() {
    }

    public Homework(int id, String lectureId, String task) {
        this.id = id;
        this.lectureId = lectureId;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectureId() {
        return lectureId;
    }

    public void setLectureId(String lectureId) {
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
                "id=" + id +
                ", lectureId='" + lectureId + '\'' +
                ", task='" + task + '\'' +
                '}';
    }
}
