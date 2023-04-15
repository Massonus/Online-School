package repositories;

import entity.Homework;

public class HomeworkRepo implements AboutRepo {

    private static Homework[] homeworks;

    public static Homework[] getHomeworks() {
        return homeworks;
    }

    @Override
    public void getIt() {
        for (Homework homework : homeworks) {
            System.out.println(homework);
        }
    }

    @Override
    public void add() {

        if (homeworks != null && homeworks.length > 0) {
            if (homeworks[0] != null) {
                System.out.println("Exist");
                return;
            }
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void getByld() {

    }

    @Override
    public void deleteByld() {

    }
}
