package entity;

public class Lecture extends University {

    public static int count;

    private int personId;

    private String name;

    private String description;

    public Lecture(int id, String name, int personId) {
        super(id, name);
        this.personId = personId;
        count++;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Lecture() {
    }

    public Lecture(int id, String name) {
        super(id, name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
