package repositories;

import entity.Homework;
import entity.University;

public class HomeworkRepo extends UniversityRepo {

    private static Homework[] homeworks;

    public static Homework[] getHomeworks() {
        return homeworks;
    }

    @Override
    public void getAll() {
        super.getAll();
    }

    @Override
    public void add(University university) {
        super.add(university);
    }

    @Override
    public void getByld() {
        super.getByld();
    }

    @Override
    public void deleteByld() {
        super.deleteByld();
    }
}
