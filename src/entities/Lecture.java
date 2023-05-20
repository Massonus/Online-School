package entities;

import java.io.Serializable;

public class Lecture implements Serializable {

    private static Homework[] homeworks;
    public static int count;

    private Integer personId;

    private String name;

    private String description;

    private String date;


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;

    }

    public Lecture() {
    }

    public Lecture(Integer personId, String name, String description, String date) {
        this.personId = personId;
        this.name = name;
        this.description = description;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
