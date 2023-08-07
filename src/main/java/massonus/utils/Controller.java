package massonus.utils;

import massonus.config.JpaConfig;
import massonus.entity.*;
import massonus.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);
    final ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
    AdditionalMaterialsService additionalMaterialsService = ctx.getBean(AdditionalMaterialsService.class);
    CourseService courseService = ctx.getBean(CourseService.class);
    HomeworkService homeworkService = ctx.getBean(HomeworkService.class);
    LectureService lectureService = ctx.getBean(LectureService.class);
    PersonService personService = ctx.getBean(PersonService.class);
    StudentService studentService = ctx.getBean(StudentService.class);
    TeacherService teacherService = ctx.getBean(TeacherService.class);

    public void Console() {

        int ch;

        while (true) {
            Scanner scanner12 = new Scanner(System.in);
            do {

                System.out.println("Choose your category, use only numbers from 1 to 6: \n");
                System.out.println("1 to choose Additional materials");
                System.out.println("2 to choose Course");
                System.out.println("3 to choose Homework");
                System.out.println("4 to choose Lecture");
                System.out.println("5 to choose Person");
                System.out.println("6 to choose Student");
                System.out.println("7 to choose Teacher");
                System.out.println("8 to print List of materials");
                System.out.println("9 to print List of courses");
                System.out.println("10 to print List of homeworks");
                System.out.println("11 to print List of lectures");
                System.out.println("12 to print List of persons");
                System.out.println("13 to print List of students");
                System.out.println("14 to print List of teachers");
                System.out.println("15 to close the program");
                System.out.println("16 to close Menu");


                try {
                    ch = scanner12.nextInt();
                } catch (NoSuchElementException e) {
                    System.out.println(e);
                    ch = scanner1.nextInt();
                }

            } while (ch < 1 && ch > 27);

            switch (ch) {

                case 1:
                    System.out.println("Enter how many Materials do you want\n");
                    int m = scanner.nextInt();
                    for (int i = 0; i < m; i++) {

                        System.out.println("\nInput name");
                        String name = scanner1.nextLine();

                        System.out.println("\n Input lectureID");
                        Integer lectureID = scanner2.nextInt();

                        System.out.println("\n Input video");
                        String video = scanner3.nextLine();

                        System.out.println("\n Input book");
                        String book = scanner4.nextLine();

                        additionalMaterialsService.createMaterialsBeforeStart(name, lectureID, video, book);
                    }

                    break;

                case 2:
                    System.out.println("Enter how many Courses do you want\n");
                    int c = scanner.nextInt();

                    for (int i = 0; i < c; i++) {

                        System.out.println("\nInput Course name");
                        String name = scanner1.nextLine();

                        System.out.println("\nInput Course value");
                        Integer value = scanner2.nextInt();

                        courseService.createCoursesBeforeStart(name, value);
                    }
                    break;

                case 3:
                    System.out.println("Enter how many Homeworks do you want\n");
                    int h = scanner.nextInt();

                    for (int i = 0; i < h; i++) {

                        System.out.println("Input Homework task");
                        String task = scanner1.nextLine();

                        homeworkService.createHomeworksBeforeStart(task);

                    }
                    break;

                case 4:
                    System.out.println("Enter how many Lectures do you want\n");
                    int l = scanner.nextInt();

                    for (int i = 0; i < l; i++) {

                        System.out.println("\nInput Lecture name");
                        String name = scanner1.nextLine();

                        System.out.println("\nInput Lecture description");
                        String description = scanner2.nextLine();

                        lectureService.createLecturesBeforeStart(name, description);
                    }

                    break;

                case 5:
                    System.out.println("Enter how many Persons do you want\n");
                    int p = scanner.nextInt();

                    for (int i = 0; i < p; i++) {

                        System.out.println("\nInput Person first name");

                        String firstname = scanner1.nextLine();


                        System.out.println("\nInput Person lastname");
                        String lastname = scanner2.nextLine();


                        System.out.println("\nInput Person phone");
                        String phone = scanner3.nextLine();

                        personService.createPersonsBeforeStart(firstname, lastname, phone);
                    }

                    break;

                case 6:
                    System.out.println("Enter how many students do you want\n");
                    int s = scanner.nextInt();

                    for (int i = 0; i < s; i++) {

                        System.out.println("\nInput Student first name");
                        String firstName = scanner1.nextLine();


                        System.out.println("\nInput Student last name");
                        String lastName = scanner2.nextLine();

                        studentService.createStudentsBeforeStart(firstName, lastName);

                    }

                    break;

                case 7:
                    System.out.println("Enter how many teachers do you want\n");
                    int t = scanner.nextInt();

                    for (int i = 0; i < t; i++) {

                        System.out.println("\nInput Teacher first name");
                        String firstName = scanner1.nextLine();

                        System.out.println("\nInput Teacher last name");
                        String lastName = scanner2.nextLine();

                        teacherService.createTeachersBeforeStart(firstName, lastName);

                    }
                    break;

                case 8:
                    final List<AdditionalMaterials> additionalMaterials = additionalMaterialsService.findAll();
                    additionalMaterials.forEach(System.out::println);
                    break;

                case 9:
                    final List<Course> courses = courseService.findAll();
                    courses.forEach(System.out::println);
                    break;

                case 10:
                    List<Homework> homeworks = homeworkService.findAll();
                    homeworks.forEach(System.out::println);
                    break;

                case 11:
                    List<Lecture> lectures = lectureService.findAll();
                    lectures.forEach(System.out::println);
                    break;

                case 12:
                    List<Person> persons = personService.findAll();
                    persons.forEach(System.out::println);
                    break;

                case 13:
                    List<Student> students = studentService.findAll();
                    students.forEach(System.out::println);
                    break;

                case 14:
                    List<Teacher> teachers = teacherService.findAll();
                    teachers.forEach(System.out::println);
                    break;

                case 16:
                    System.exit(0);
                    break;

                case 17:
                    return;


            }


        }

    }




}
