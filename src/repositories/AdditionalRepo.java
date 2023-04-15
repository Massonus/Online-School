package repositories;

import entity.Additional;

public class AdditionalRepo implements AboutRepo {

private static Additional[] additionals;

    public static Additional[] getAdditionals() {
        return additionals;
    }


    @Override
    public void getIt() {
        for (Additional additional : additionals) {
            System.out.println(additional);
        }
    }

    @Override
    public void add() {

        if (additionals != null && additionals.length > 0) {
            if (additionals[0] != null) {
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
