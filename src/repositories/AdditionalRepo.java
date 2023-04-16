package repositories;

import entities.AdditionalMaterials;

public class AdditionalRepo implements AboutRepo {

    private static AdditionalMaterials[] additionalMaterials;

    public static AdditionalMaterials[] getAdditionals() {
        return additionalMaterials;
    }


    @Override
    public void getIt() {
        for (AdditionalMaterials additionalMaterials : AdditionalRepo.additionalMaterials) {
            System.out.println(additionalMaterials);
        }
    }

    @Override
    public void add() {

        if (additionalMaterials != null && additionalMaterials.length > 0) {
            if (additionalMaterials[0] != null) {
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
