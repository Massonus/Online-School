package repositories;

import entity.Additional;
import entity.University;

public class AdditionalRepo extends UniversityRepo {

private static Additional[] additionals;

    public static Additional[] getAdditionals() {
        return additionals;
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
