package entity;

public class Person {

    private int id;

    private String courseId;

    private Role role;

    public Person(int id, String courseId, Role role) {
        this.id = id;
        this.courseId = courseId;
        this.role = role;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", courseId='" + courseId + '\'' +
                ", role=" + role +
                '}';
    }
}
