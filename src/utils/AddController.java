package utils;

import entities.AdditionalMaterials;
import entities.ResourceType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddController {

    AdditionalMaterials additionalMaterials = new AdditionalMaterials(1, "Math", 45, ResourceType.BOOK);
    AdditionalMaterials additionalMaterials1 = new AdditionalMaterials(2, "UK", 32, ResourceType.URL);
    AdditionalMaterials additionalMaterials2 = new AdditionalMaterials(3, "Geo", 12, ResourceType.VIDEO);
    Scanner scanner = new Scanner(System.in);
    List<AdditionalMaterials> additionals = new ArrayList<>();


    public void Menu() {
        additionals.add(additionalMaterials);
        additionals.add(additionalMaterials1);
        additionals.add(additionalMaterials2);
        int cs;

        while (true) {

            do {

                System.out.println("Choose your category, use only numbers from 1 to 6: \n");
                System.out.println("1 to choose first id of Material");
                System.out.println("2 to choose second id of Material");
                System.out.println("3 to choose third id of Material");
                System.out.println("4 to close this Menu");

                cs = scanner.nextInt();


            } while (cs < 1 && cs > 6);

            switch (cs) {

                case 1:
                    System.out.println(additionals.get(0));
                    break;
                case 2:
                    System.out.println(additionals.get(1));
                    break;
                case 3:
                    System.out.println(additionals.get(2));
                    break;
                case 4:
                    return;
            }

        }

    }

}
