package utils;

import entity.*;
import repositories.LectureRepo;

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
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Lecture[] lectures = LectureRepo.getLectures();
        Person person = new Person();
        Teacher teacher = new Teacher();
        int ch;
        while (true) {
            do {

                System.out.println("Choose your category, use only numbers from 1 to 6: \n");
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
                    Course course = new Course();
                    System.out.println(course);
                    break;
                case 2:
                    System.out.println(teacher.getName());
                    break;
                case 3:
                    System.out.println("Input Student's Id (only numbers)");
                    int id1 = scanner.nextInt();

                    person.setRole(Role.STUDENT);
                    person.setId(id1);
                    System.out.println("Input Student's Course id");
                    String courseId = scanner1.nextLine();
                    person.setCourseId(courseId);

                    System.out.println(person);

                    break;
                case 4:
                    for (int i = 0; i < lectures.length; i++) {

                        Lecture lecture = new Lecture();
                        System.out.println("\nInput Lecture Id (only numbers)");

                        int id = scanner1.nextInt();

                        lecture.setId(id);

                        System.out.println("\nInput Lecture name");

                        String name = scanner2.nextLine();
                        lecture.setName(name);
                        System.out.println("Input the id of teacher");

                        int teacherId = scanner.nextInt();
                        teacher.setId(teacherId);

                        System.out.println("Input the name of teacher");
                        String teacherName = scanner4.nextLine();
                        teacher.setName(teacherName);

                        System.out.println("\nFull lecture: " + lecture.getId() + " " + teacher);
                        lectures[i] = lecture;
                        System.out.println(lectures[i]);

                        if (lectures.length > 5) {

                            Lecture[] lectures1 = Arrays.copyOf(lectures, lectures.length * 3 / 2 + 1);
                            lectures = lectures1;
                        }

                    }

                    break;
                case 5:
                    System.exit(0);
                    break;

                case 6:
                    for (Lecture lecture : lectures) {
                        System.out.println(lecture.getId());

                    }

                default:
                    System.out.println("Incorrect symbol");

            }

        }
    }

}
