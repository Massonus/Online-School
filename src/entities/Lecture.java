package entities;

public class Lecture {

    private static Homework[] homeworks;
    public static int count;

    private Integer personId;

    private String name;

    private String description;


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
            this.personId = personId;

    }

    public Lecture() {
    }

    public Lecture(int personId, String name, String description) {
        this.personId = personId;
        this.name = name;
        this.description = description;
        count++;
    }

    public String getName() {
        return name;
    }


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
