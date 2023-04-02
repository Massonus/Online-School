package entity;

public class Lecture extends University {

    public static int count;


     public Lecture(int id, String name) {
        super(id, name);
        count++;
    }

    public Lecture() {
    }
}
