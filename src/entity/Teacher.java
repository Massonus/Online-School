package entity;

public class Teacher extends University {

    public Teacher(int id, String name) {
        super(id, name);
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{}";
    }
}
