package utils;

import entities.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);
    Scanner scanner5 = new Scanner(System.in);
    Scanner scanner6 = new Scanner(System.in);
    Scanner scanner7 = new Scanner(System.in);
    MyEx myEx = new MyEx();
    Person person = new Person();
    List<Course> courses = new ArrayList<>();
    Set<Student> students = new TreeSet<>();
    Set<Teacher> teachers = new TreeSet<>();
    Set<Lecture> lectures = new TreeSet<>();


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
                System.out.println("7 to print List of lectures");
                System.out.println("8 to print List of courses");
                System.out.println("9 to print List of teachers");
                System.out.println("10 to print List of students");
                System.out.println("11 to check data of Person");
                System.out.println("12 to close Menu\n");


                try {
                    ch = scanner.nextInt();
                } catch (NoSuchElementException e) {
                    System.out.println(e);
                    ch = scanner1.nextInt();
                }

            } while (ch < 1 && ch > 6);

            switch (ch) {
                case 1:
                    for (int i = 0; i < 2; i++) {
                        Course course = new Course();

                        System.out.println("\nInput Course Id (only numbers)");
                        int id = scanner.nextInt();

                        course.setId(id);

                        System.out.println("\nInput Course name");

                        String name = scanner1.nextLine();
                        course.setName(name);
                        System.out.println(course);
                        courses.add(course);
                    }
                    break;
                case 2:
                    for (int i = 0; i < 2; i++){


                    Teacher teacher = new Teacher();

                    System.out.println("\nInput Teacher Id (only numbers)");
                    int id = scanner.nextInt();

                    teacher.setId(id);

                    System.out.println("\nInput Teacher first name");

                    String name = scanner1.nextLine();
                    teacher.setFirstName(name);

                    System.out.println("\nInput Teacher last name");

                    String name1 = scanner2.nextLine();
                    teacher.setLastName(name1);
                    System.out.println(teacher);
                    teachers.add(teacher);
                }
                    break;
                case 3:
                    System.out.println("\nInput Person first name");

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

                    for (int i = 0; i < 2; i++) {

                        Student student = new Student();

                        System.out.println("\nInput Student Id (only numbers)");

                        int id = scanner.nextInt();

                        student.setId(id);

                        System.out.println("\nInput Student first name");

                        String name = scanner1.nextLine();
                        student.setFirstName(name);

                        System.out.println("\nInput Student last name");

                        String name1 = scanner2.nextLine();
                        student.setLastName(name1);
                        System.out.println(student);
                        students.add(student);
                    }
                    break;
                case 5:


                    for (int i = 0; i < 3; i++) {

                        Lecture lecture = new Lecture();

                        System.out.println("\nInput Lecture Id (only numbers)");

                        int id3= scanner.nextInt();

                        lecture.setPersonId(id3);
                        System.out.println("\nInput Lecture name");

                        String name3 = scanner1.nextLine();
                        lecture.setName(name3);
                        System.out.println("\nInput Lecture description");

                       String name4 = scanner2.nextLine();
                        lecture.setDescription(name4);

                        lectures.add(lecture);

                        System.out.println("\nFull lecture: " + lecture);


                    }

                    break;
                case 6:
                    System.exit(0);
                    break;

                case 7:
                    printLectures();
                    break;

                case 8:
                    printCourses();
                    break;
                case 9:
                    printTeachers();
                    break;

                case 10:
                    printStudents();
                    break;

                case 11:
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
                case 12:
                    return;

            }

        }

    }

    public void printLectures() {

        for (Lecture lecture1 : lectures) {
            System.out.println(lecture1);
        }

    }
    public void printCourses() {
        List list = new ArrayList(courses);
        Comparator comparatorByName = Comparator.comparing(Course::getName);
        Collections.sort(list, comparatorByName);
        System.out.println(list);

    }
    public void printStudents() {
        List list = new ArrayList(students);
        Comparator comparatorLastByName = Comparator.comparing(Student::getLastName);
        Collections.sort(list, comparatorLastByName);
        System.out.println(list);

    }
    public void printTeachers() {
        List list = new ArrayList(teachers);
        Comparator comparatorLastByName = Comparator.comparing(Teacher::getLastName);
        Collections.sort(list, comparatorLastByName);
        System.out.println(list);

    }
}
