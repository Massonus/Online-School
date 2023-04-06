package entity;

public class Lecture extends University {

    public static int count;

    private int personId;


     public Lecture(int id, String name, int personId) {
        super(id, name);
        this.personId = personId;
        count++;
    }

    public Lecture() {
    }
}
