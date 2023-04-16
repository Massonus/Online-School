package utils;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);
    MyEx myEx = new MyEx();
    Course course = new Course();
    Person person = new Person();
    Teacher teacher = new Teacher();
    List<Lecture> lectures = new ArrayList<>();

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
                System.out.println("7 to print List");
                System.out.println("8 to check data of Person");
                System.out.println("9 to get Course\n");


                try {
                    ch = scanner.nextInt();
                } catch (NoSuchElementException e) {
                    System.out.println(e);
                    ch = scanner1.nextInt();
                }

            } while (ch < 1 && ch > 6);

            switch (ch) {
                case 1:
                    System.out.println("\nInput Course Id (only numbers)");
                    int id2 = scanner.nextInt();

                    course.setId(id2);

                    System.out.println("\nInput Course name");

                    String name2 = scanner1.nextLine();
                    course.setName(name2);
                    System.out.println(course);
                    break;
                case 2:
                    System.out.println(teacher.getName());
                    break;
                case 3:
                    System.out.println("\nInput Person firstname");

                    String firstname = scanner2.nextLine();
                    person.setFirstname(firstname);

                    System.out.println("\nInput Person lastname");
                    String lastname = scanner1.nextLine();
                    person.setLastname(lastname);

                    System.out.println("\nInput Person phone");
                    String phone = scanner3.nextLine();
                    person.setPhone(phone);

                    System.out.println("\nInput Person email");

                    String email = scanner4.nextLine();
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
                    int id;
                    String name;
                    String name1;
                    for (int i = 0; i < 3; i++) {

                        Lecture lecture = new Lecture();

                        System.out.println("\nInput Lecture Id (only numbers)");

                        id = scanner.nextInt();

                        lecture.setPersonId(id);
                        System.out.println("\nInput Lecture name");

                        name = scanner1.nextLine();
                        lecture.setName(name);
                        System.out.println("\nInput Lecture description");

                        name1 = scanner2.nextLine();
                        lecture.setDescription(name1);

                        lectures.add(lecture);

                        System.out.println("\nFull lecture: " + lecture);

                    }

                    break;
                case 6:
                    System.exit(0);
                    break;

                case 7:
                    findAll();
                    break;

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

    public void findAll() {
        for (Lecture lecture1 : lectures) {
            System.out.println(lecture1);
        }
    }
}
