package utils;

import Comparators.CompareById;
import Comparators.CompareByLectureId;
import entities.AdditionalMaterials;
import entities.ResourceType;
import entities.Teacher;

import java.util.*;

public class AddController {

    AdditionalMaterials additionalMaterials = new AdditionalMaterials(1, "Math", 13, ResourceType.BOOK);
    AdditionalMaterials additionalMaterials1 = new AdditionalMaterials(2, "UK", 20, ResourceType.URL);
    AdditionalMaterials additionalMaterials2 = new AdditionalMaterials(3, "Geo", 15, ResourceType.VIDEO);
    Scanner scanner = new Scanner(System.in);
    List<AdditionalMaterials> additionals = new ArrayList<>();

    Comparator comparatorById = new CompareById();
    Comparator comparatorByLectureId = new CompareByLectureId();



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
                System.out.println("4 to sort by id");
                System.out.println("5 to sort by lectureId");
                System.out.println("6 to sort by name");
                System.out.println("7 to close this Menu");

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
                    List list = new ArrayList(additionals);
                    Collections.sort(list, comparatorById);
                    System.out.println(list);
                    break;
                case 5:
                    List list1 = new ArrayList(additionals);
                    Collections.sort(list1, comparatorByLectureId);
                    System.out.println(list1);
                    break;
                case 6:
                    List list2 = new ArrayList(additionals);
                    Comparator comparatorLastByName = Comparator.comparing(AdditionalMaterials::getName);
                    Collections.sort(list2, comparatorLastByName);
                    System.out.println(list2);
                    break;
                case 7:
                    return;
            }

        }

    }
}
