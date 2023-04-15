package utils;

import entity.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    Generalization<Lecture> generalization = new Generalization<>();
    Lecture[] lectures = new Lecture[2];
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);
    Scanner scanner5 = new Scanner(System.in);
    Scanner scanner6 = new Scanner(System.in);
    Course course = new Course();
    Lecture lecture = new Lecture();
    Person person = new Person();
    Teacher teacher = new Teacher();
    Lecture[] lectures1 = generalization.add(lectures);

    public void Console() {

        int ch;
        while (true) {
            do {

                System.out.println("Choose your category, use only numbers from 1 to 6: \n");
                System.out.println("1 to choose Course");
                System.out.println("2 to choose Teacher");
                System.out.println("3 to choose Person");
                System.out.println("4 to choose Student");
                System.out.println("5 to choose Lecture");
                System.out.println("6 to close the program");
                System.out.println("7 to print Massive");
                System.out.println("8 to check data of Person\n");

                ch = scanner.nextInt();

            } while (ch < 1 && ch > 6);

            switch (ch) {
                case 1:
                    System.out.println("\nInput Course Id (only numbers)");

                    int id2 = scanner3.nextInt();

                    course.setId(id2);

                    System.out.println("\nInput Course name");

                    String name2 = scanner5.nextLine();
                    course.setName(name2);
                    System.out.println(course);
                    break;
                case 2:
                    System.out.println(teacher.getName());
                    break;
                case 3:
                    System.out.println("\nInput Person firstname");

                    String firstname = scanner4.nextLine();
                    person.setFirstname(firstname);

                    System.out.println("\nInput Person lastname");
                    String lastname = scanner1.nextLine();
                    person.setLastname(lastname);

                    System.out.println("\nInput Person phone");
                    String phone = scanner2.nextLine();
                    person.setPhone(phone);

                    System.out.println("\nInput Person email");

                    String email = scanner3.nextLine();
                    person.setEmail(email);

                    System.out.println(person);
                    break;
                case 4:
                    System.out.println("Input Student's Id (only numbers)");
                    int id1 = scanner.nextInt();

                    person.setRole(Role.STUDENT);
                    person.setId(id1);
                    System.out.println("Input Student's Course id");
                    String courseId = scanner1.nextLine();
                    person.setCourseId(courseId);

                    System.out.println(person);

                    break;
                case 5:

                    for (int i = 0; i < lectures1.length; i++) {

                        System.out.println("\nInput Lecture Id (only numbers)");

                        int id = scanner1.nextInt();

                        lecture.setPersonId(id);

                        System.out.println("\nInput Lecture name");

                        String name = scanner5.nextLine();
                        lecture.setName(name);

                        System.out.println("\nInput Lecture description");

                        String name3 = scanner6.nextLine();
                        lecture.setDescription(name3);

                        lectures1[i] = lecture;
                        System.out.println(lectures1[i]);

                        System.out.println("Input the id of teacher");

                        int teacherId = scanner.nextInt();
                        teacher.setId(teacherId);

                        System.out.println("Input the name of teacher");
                        String teacherName = scanner4.nextLine();
                        teacher.setName(teacherName);

                        System.out.println("\nFull lecture: " + lecture.getPersonId() + " " + teacher);

                    }

                    break;
                case 6:
                    System.exit(0);
                    break;

                case 7:
                    for (Lecture lecture1 : lectures1) {
                        System.out.println(lecture1);

                    }
                    break;
                default:
                    System.out.println("Incorrect symbol");
                case 8:
                    Pattern pattern = Pattern.compile("(\\w+)");
                    Matcher matcher = pattern.matcher(person.getFirstname());

                    while (matcher.find()) {
                        int start = matcher.start();
                        int end = matcher.end();
                        System.out.println("Found a match - " + person.getFirstname().substring(start, end) + " from index " + start + " to " + (end - 1));
                        System.out.println(matcher.group());
                        System.out.println("Found a match - " + person.getLastname().substring(start, end) + " from index " + start + " to " + (end - 1));
                        System.out.println(matcher.group());
                        System.out.println("Found a match - " + person.getPhone().substring(start, end) + " from index " + start + " to " + (end - 1));
                        System.out.println(matcher.group());
                        System.out.println("Found a match - " + person.getPhone().substring(start, end) + " from index " + start + " to " + (end - 1));
                        System.out.println(matcher.group());
                    }
                    System.out.println(matcher.groupCount());
                    break;

            }

        }
    }


}
