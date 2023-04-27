package Comparators;

import entities.AdditionalMaterials;

import java.util.Comparator;

public class CompareById implements Comparator<AdditionalMaterials> {
    @Override
    public int compare(AdditionalMaterials o1, AdditionalMaterials o2) {
        return o1.getId() - o2.getId();
    }
}
