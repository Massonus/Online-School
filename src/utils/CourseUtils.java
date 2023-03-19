package utils;

import entity.Course;
import entity.Lecture;
import entity.Student;
import entity.Teacher;

import java.util.Scanner;

public class CourseUtils {

    public void Console() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your category, use only numbers from 1 to 4: \n");
        System.out.println("1 to choose Course");
        System.out.println("2 to choose Teacher");
        System.out.println("3 to choose Student");
        System.out.println("4 to choose Lecture\n");

        final int choose = scanner.nextInt();


        switch (choose) {
            case 1:
                Course course = new Course(36, "First");
                System.out.println(course);
                break;
            case 2:
                Teacher teacher = new Teacher();
                System.out.println(teacher.getName());
                break;
            case 3:
                Student student = new Student();
                System.out.println(student.getName());
                break;
            case 4:
                Lecture lecture1 = new Lecture(0, "will enter..");

                System.out.println(lecture1.getCourseId());
                System.out.println("\nInput Lecture Id (only numbers)");
                Scanner scanner1 = new Scanner(System.in);
                final int id = scanner1.nextInt();
                lecture1.setId(id);

                System.out.println("\nInput Lecture name");
                Scanner scanner2 = new Scanner(System.in);
                final String name = scanner2.nextLine();
                lecture1.setCourseId(name);

                System.out.println("\nFull lecture: " + lecture1);
                System.out.println("Only id: " + lecture1.getId());

                Lecture lecture2 = new Lecture(0, "will enter..");
                System.out.println("\nCreate the second lecture:");
                System.out.println("Input Lecture Id (only numbers)");
                Scanner scanner3 = new Scanner(System.in);

                final int id1 = scanner3.nextInt();
                lecture2.setId(id1);
                System.out.println("Input Lecture name");
                Scanner scanner4 = new Scanner(System.in);
                final String name1 = scanner4.nextLine();
                lecture2.setCourseId(name1);

                System.out.println("\nFull the second lecture: " + lecture2);
                System.out.println("Only id of the second: " + lecture2.getId());

                System.out.println("\nTwo lectures:" );
                System.out.println(lecture1);
                System.out.println(lecture2);

                break;
            default:
                System.out.println("Incorrect symbol");
        }

    }


}
