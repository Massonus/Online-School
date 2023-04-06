package utils;

import entity.Course;
import entity.Lecture;
import entity.Student;
import entity.Teacher;

import java.util.Scanner;

public class CourseUtils {

    public void Console() {
        final Scanner scanner = new Scanner(System.in);
        int ch;
        while (true) {
            do {

                System.out.println("Choose your category, use only numbers from 1 to 4: \n");
                System.out.println("1 to choose Course");
                System.out.println("2 to choose Teacher");
                System.out.println("3 to choose Student");
                System.out.println("4 to choose Lecture");
                System.out.println("5 to close the program\n");
                ch = scanner.nextInt();

            } while (ch < 1 && ch > 5);

            switch (ch) {
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
                    for (int i = 0; i < 9; i++) {
                        Lecture lecture = new Lecture(0, "null");
                        System.out.println(lecture.getCourseId());
                        System.out.println("\nInput Lecture Id (only numbers)");
                        Scanner scanner1 = new Scanner(System.in);
                        final int id = scanner1.nextInt();
                        lecture.setId(id);
                        System.out.println("\nInput Lecture name");
                        Scanner scanner2 = new Scanner(System.in);
                        final String name = scanner2.nextLine();
                        lecture.setCourseId(name);
                        System.out.println("\nFull lecture: " + lecture);
                        System.out.println("Only id: " + lecture.getId());

                        if (lecture.getId() > 8) {
                            System.out.println("Sorry, but you can add only 8 lectures\n");
                            break;
                        }

                    }

                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Incorrect symbol");

            }

        }
    }

}
