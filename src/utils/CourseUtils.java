package utils;

import Repositories.LectureRepo;
import entity.Course;
import entity.Lecture;
import entity.Student;
import entity.Teacher;

import java.util.Arrays;
import java.util.Scanner;

public class CourseUtils {

    public void CreateCourse() {
    Course course = new Course(1, "First");
    }

    public void Console() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Lecture[] lectures = LectureRepo.lectures;
        int ch;
        while (true) {
            do {

                System.out.println("Choose your category, use only numbers from 1 to 4: \n");
                System.out.println("1 to choose Course");
                System.out.println("2 to choose Teacher");
                System.out.println("3 to choose Student");
                System.out.println("4 to choose Lecture");
                System.out.println("5 to close the program");
                System.out.println("6 to print Massive\n");
                ch = scanner.nextInt();

            } while (ch < 1 && ch > 6);

            switch (ch) {
                case 1:
                    Course course = new Course(0, "null");
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
                    for (int i = 0; i < lectures.length; i++) {

                        Lecture lecture = new Lecture(0, "null");
                        System.out.println("\nInput Lecture Id (only numbers)");

                        int id = scanner1.nextInt();

                        lecture.setId(id);

                        System.out.println("\nInput Lecture name");

                        String name = scanner2.nextLine();
                        lecture.setCourseId(name);
                        System.out.println("\nFull lecture: " + lecture + "\n");
                        lectures[i] = lecture;
                        System.out.println(lectures[i]);

                        if (lectures.length > 5) {

                            Lecture[] lectures1 = Arrays.copyOf(lectures, lectures.length * 3 / 2 + 1);
                        }

                    }

                    break;
                case 5:
                    System.exit(0);
                    break;

                case 6:
                        for (int i = 0; i < lectures.length; i++) {
                            System.out.println(lectures[i]);

                        }

                default:
                    System.out.println("Incorrect symbol");

            }

        }
    }

}
