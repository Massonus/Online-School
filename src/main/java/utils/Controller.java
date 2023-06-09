package utils;

import checkLog.Logging;
import checkLog.Logger;
import entities.*;
import repositories.BaseRepo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);
    Scanner scanner5 = new Scanner(System.in);
    Scanner scanner6 = new Scanner(System.in);
    Scanner scanner7 = new Scanner(System.in);
    Scanner scanner8 = new Scanner(System.in);
    Scanner scanner9 = new Scanner(System.in);
    Scanner scanner10 = new Scanner(System.in);
    Scanner scanner11 = new Scanner(System.in);
    MyEx myEx = new MyEx();
    Logger logger = new Logger();
    Person person = new Person();
    List<Person> persons = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();
    List<Lecture> lectures = new ArrayList<>();

    List<AdditionalMaterials> additionalMaterialsList = new ArrayList<>();
    Map<String, List<Homework>> homeworkMap = new HashMap<>();
    Map<String, List<AdditionalMaterials>> additionalMap = new HashMap<>();
    LectureUtils lectureUtils = new LectureUtils();

    public void Console() {

        int ch;

        while (true) {
            Scanner scanner12 = new Scanner(System.in);
            do {

                System.out.println("Choose your category, use only numbers from 1 to 6: \n");
                System.out.println("1 to choose Course");
                System.out.println("2 to choose Teacher");
                System.out.println("3 to choose Person");
                System.out.println("4 to choose Student");
                System.out.println("5 to choose Lecture");
                System.out.println("6 to choose Homework");
                System.out.println("7 to choose Additional materials");
                System.out.println("8 to print List of lectures");
                System.out.println("9 to print List of courses");
                System.out.println("10 to print List of teachers");
                System.out.println("11 to print List of students");
                System.out.println("12 to print List of Homework");
                System.out.println("13 to print List of Additional materials");
                System.out.println("14 to check data of Person");
                System.out.println("15 to close the program");
                System.out.println("16 to close Menu");
                System.out.println("17 to print Logger");
                System.out.println("18 to add info to the File");
                System.out.println("19 to do Serialization");
                System.out.println("20 to do Deserialization");
                System.out.println("19 to do Serialization");
                System.out.println("21 to see filterLecture");
                System.out.println("22 to see dates of Lectures");
                System.out.println("23 to see Homework deadline");
                System.out.println("24 to print filtered List of teachers");
                System.out.println("25 to print file with logs");
                System.out.println("26 to print dublicates");
                System.out.println("27 to print first lecture");
                System.out.println("28 to print how many INFOes in Logging.txt");
                System.out.println("29 to print groped lectures");
                System.out.println("30 to print grouped additional materials");
                System.out.println("31 to print sorted Map");
                System.out.println("32 to write emails to the file");
                System.out.println("33 to see logs");
                System.out.println("34 to get add materials from data base");
                System.out.println("35 to add new lines to  materials");

                try {
                    ch = scanner12.nextInt();
                } catch (NoSuchElementException e) {
                    System.out.println(e);
                    ch = scanner1.nextInt();
                }

            } while (ch < 1 && ch > 27);

            switch (ch) {
                case 1:
                    System.out.println("Enter how many courses do you want\n");
                    int c = scanner9.nextInt();

                    for (int i = 0; i < c; i++) {
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
                    System.out.println("Enter how many teachers do you want\n");
                    int t = scanner11.nextInt();

                    for (int i = 0; i < t; i++) {

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
                    System.out.println("Enter how many persons do you want\n");
                    int p = scanner6.nextInt();

                    for (int i = 0; i < p; i++) {
                        Person person = new Person();

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

                        persons.add(person);
                    }
                    break;
                case 4:
                    System.out.println("Enter how many students do you want\n");
                    int s = scanner10.nextInt();

                    for (int i = 0; i < s; i++) {

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
                    System.out.println("Enter how many lectures do you want\n");
                    int l = scanner5.nextInt();

                    for (int i = 0; i < l; i++) {

                        Lecture lecture = new Lecture();

                        System.out.println("\nInput Lecture Id (only numbers)");
                        int id3 = scanner.nextInt();
                        lecture.setPersonId(id3);

                        System.out.println("\nInput Lecture name");
                        String name3 = scanner1.nextLine();
                        lecture.setName(name3);

                        System.out.println("\nInput Lecture description");
                        String name4 = scanner2.nextLine();
                        lecture.setDescription(name4);

                        System.out.println("\nInput Lecture date");
                        String name5 = scanner2.nextLine();
                        lecture.setDate(name5);

                        System.out.println("\n Input name of a teacher");

                        String name6 = scanner3.nextLine();

                        System.out.println("\n Input Lastname of a teacher");

                        String name7 = scanner4.nextLine();

                        lecture.setTeacher(new Teacher(i, name6, name7));

                        lectures.add(lecture);

                        System.out.println("\nFull lecture: " + lecture);

                    }

                    break;
                case 6:
                    System.out.println("Enter how many homeworks do you want\n");
                    int h = scanner.nextInt();

                    for (int i = 0; i < h; i++) {
                        Homework homework = new Homework();
                        List<Homework> homeworks = new ArrayList<>();
                        System.out.println("Input Homework id");

                        int lectureId = scanner6.nextInt();
                        homework.setLectureId(lectureId);

                        System.out.println("Input Homework task");

                        String name = scanner7.nextLine();
                        homework.setTask(name);

                        homeworks.add(homework);
                        String k = String.valueOf(lectureId);
                        homeworkMap.put(k, homeworks);
                    }

                    break;
                case 7:
                    System.out.println("Enter how many Materials do you want\n");
                    int m = scanner1.nextInt();

                    for (int i = 0; i < m; i++) {
                        AdditionalMaterials additionalMaterials = new AdditionalMaterials();
                        /*List<AdditionalMaterials> additionalMaterialsList = new ArrayList<>();*/

                        System.out.println("Input Additional id");

                        int lectureId = scanner8.nextInt();
                        additionalMaterials.setLectureId(lectureId);

                        System.out.println("Input Additional task");

                        String name = scanner9.nextLine();
                        additionalMaterials.setName(name);

                        String name1 = scanner10.nextLine();

                        additionalMaterials.setLecture(new Lecture(i, name1, "about something", "28.05.2023", new Teacher(i, "First Teacher" + i, "Last teacher" + i)));

                        additionalMaterialsList.add(additionalMaterials);

                        String k = String.valueOf(lectureId);
                        additionalMap.put(k, additionalMaterialsList);

                    }
                    break;
                case 8:
                    printLectures();
                    break;

                case 9:
                    printCourses();
                    break;
                case 10:
                    printTeachers();
                    break;

                case 11:
                    printStudents();
                    break;
                case 12:
                    homeworkMap.forEach((k, v) -> {
                        System.out.println(k + " " + v);
                    });

                    System.out.println("Choose the element what you want to delete");
                    String del = scanner10.nextLine();

                    homeworkMap.remove(del);

                    homeworkMap.forEach((k, v) -> {
                        System.out.println(k + " " + v);
                    });
                    System.out.println("Put a new element");
                    Homework homework = new Homework();
                    List<Homework> homeworks = new ArrayList<>();

                    System.out.println("Input Homework id");
                    int lectureId = scanner6.nextInt();
                    homework.setLectureId(lectureId);

                    System.out.println("Input Homework task");

                    String name = scanner7.nextLine();
                    homework.setTask(name);

                    homeworks.add(homework);
                    String k = String.valueOf(lectureId);
                    homeworkMap.put(k, homeworks);

                    break;
                case 13:

                    additionalMap.forEach((a, b) -> {
                        System.out.println(a + " " + b);
                    });

                    break;

                case 14:

                    Person first = Optional.ofNullable(person).orElseGet(() -> new Person(1, "First", Role.STUDENT));

                    Pattern pattern = Pattern.compile("(\\w+)");
                    Matcher matcher = pattern.matcher(first.getFirstname());

                    while (matcher.find()) {
                        int start = matcher.start();
                        int end = matcher.end();
                        System.out.println("Found a match - " + first.getFirstname().substring(start, end) + " from index " + start + " to " + (end - 1));
                        System.out.println(matcher.group());
                        System.out.println("Found a match - " + first.getLastname().substring(start, end) + " from index " + start + " to " + (end - 1));
                        System.out.println(matcher.group());
                        System.out.println("Found a match - " + first.getPhone().substring(start, end) + " from index " + start + " to " + (end - 1));
                        System.out.println(matcher.group());
                        System.out.println("Found a match - " + first.getPhone().substring(start, end) + " from index " + start + " to " + (end - 1));
                        System.out.println(matcher.group());
                    }
                    System.out.println(matcher.groupCount());
                    break;

                case 15:
                    System.exit(0);
                    break;

                case 16:
                    return;

                case 17:
                    logger.Logging();
                    break;

                case 18:
                    logger.addInfo("src/CheckLog/Logging.txt", "Added");
                    break;

                case 19:
                    serial("src/utils/ser.txt");
                    break;

                case 20:
                    deSerial("src/utils/ser.txt");
                    break;

                case 21:
                    filterLectures();
                    break;
                case 22:
                    System.out.println("Before format: \n" + Lecture.creationDate);
                    System.out.println("After format: ");
                    lectureUtils.formatDate();
                    ZonedDateTime zonedDateTime = ZonedDateTime.of(Lecture.lectureDate, ZoneId.of("Europe/Kiev"));
                    System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ENGLISH).format(zonedDateTime));
                    break;

                case 23:
                    ZonedDateTime zonedDateTime1 = ZonedDateTime.of(Homework.deadline, ZoneId.of("Europe/Kiev"));
                    System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ENGLISH).format(zonedDateTime1));
                    break;

                case 24:
                    teachers.stream().filter(teach -> teach.getLastName().endsWith("N")).forEach(teach -> System.out.println(teach));
                    break;

                case 25:
                    try {
                        List<String> collect = Files.lines(Paths.get("src/checkLog/Logging.txt"))
                                .filter(f -> f.startsWith("INFO:"))
                                .collect(Collectors.toList());
                        System.out.println(collect);

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 26:
                    System.out.println("All elements: " + persons);
                    Set<Person> duplicates = findDuplicates(persons);
                    System.out.println("Dublicates: " + duplicates);
                    break;

                case 27:
                    Optional<Lecture> first1 = lectures.stream().findFirst();
                    System.out.println(first1);
                    break;
                case 28:
                    try {
                        List<String> collector = Files.lines(Paths.get("src/checkLog/Logging.txt"))
                                .filter(f -> f.startsWith("INFO:"))
                                .collect(Collectors.toList());
                        System.out.println(collector);

                        Map<String, Long> sum = collector.stream()
                                .collect(Collectors.groupingBy(
                                        Function.identity(), Collectors.counting()));
                        sum.forEach((a, v) -> System.out.println(a + ": " + v));

                        System.out.println(sum);


                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 29:
                    sortLecturesByTeacher(lectures).forEach(System.out::println);

                    break;

                case 30:
                    sortAddMatByLecture(additionalMaterialsList).forEach(System.out::println);

                    break;

                case 31:
                    printMap();

                    break;

                case 32:
                    writeFile();

                    break;

                case 33:
                    Logging.Logging();

                    break;

                case 34:
                    final List<AdditionalMaterials> materials = BaseRepo.CallableStatement();
                    materials.forEach(System.out::println);

                    break;

                case 35:
                    BaseRepo.insertColumns();

                    break;


            }


        }

    }

    public Set<Map.Entry<Teacher, List<Lecture>>> sortLecturesByTeacher(List<Lecture> lectures) {
        Map<Teacher, List<Lecture>> collect = lectures.stream().collect(Collectors.groupingBy(
                Lecture::getTeacher));

        Set<Map.Entry<Teacher, List<Lecture>>> entries1 = collect.entrySet();

        return entries1;

    }

    public Set<Map.Entry<Lecture, List<AdditionalMaterials>>> sortAddMatByLecture(List<AdditionalMaterials> additionalMaterialsList) {
        Map<Lecture, List<AdditionalMaterials>> collect = additionalMaterialsList.stream().collect(Collectors.groupingBy(
                AdditionalMaterials::getLecture));

        Set<Map.Entry<Lecture, List<AdditionalMaterials>>> entries = collect.entrySet();

        return entries;

    }

    public void printMap() {

        Map<String, String> collect = persons.stream().collect(Collectors.toMap(
                Person::getEmail,
                Person::getFirstname
        ));

        System.out.println(collect);

    }

    public void writeFile() {
        List<Person> collect = persons.stream()
                .sorted((a, b) -> b.getEmail().compareTo(String.valueOf(a)))
                .toList();
        try {
            OutputStream f = new FileOutputStream("src/utils/Emails.txt", true);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            for (int i = 0; i < collect.size(); i++) {
                out.write(collect.get(i).getEmail());
                out.flush();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }

    public static <T> Set<T> findDuplicates(Collection<T> collection) {
        Set<T> elements = new HashSet<>();

        return collection.stream()
                .filter(e -> !elements.add(e))
                .collect(Collectors.toSet());

    }

    public void filterLectures() {
        List<Lecture> result = LectureUtils.filter(lectures, a -> a.getDate().startsWith("18.05.2023") && a.getDate().endsWith("21.05.2023"));
        System.out.println(result);

        Predicate<Lecture> func1 = a -> a.getDate().equals("19.05.2023");
        Predicate<Lecture> func2 = a -> a.getDate().equals("21.05.2023");

        lectures = LectureUtils.filter(lectures, func1.and(func2));
        System.out.println("between - " + lectures);
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

    static void serial(final String path) {
        final File file = new File(path);
        final AdditionalMaterials additionalMaterials = new AdditionalMaterials();
        final Homework homework = new Homework(34, "Task 24");
        final Lecture lecture = new Lecture(4, "Second", "About plus and minus", "12.z05.2023", new Teacher());
        final Student student = new Student(23, "Ivan", "Prohorov");
        final Teacher teacher = new Teacher(45, "Maria", "Ostapenko");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(additionalMaterials);
            outputStream.writeObject(homework);
            outputStream.writeObject(lecture);
            outputStream.writeObject(student);
            outputStream.writeObject(teacher);
            System.out.println("Serialization completed successfully: \n" + additionalMaterials + "\n" + homework + "\n" + lecture + "\n" + student + "\n" + teacher);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deSerial(final String path) {
        final File file = new File(path);

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            final AdditionalMaterials deSer = (AdditionalMaterials) inputStream.readObject();
            final Homework deSer1 = (Homework) inputStream.readObject();
            final Lecture deSer2 = (Lecture) inputStream.readObject();
            final Student deSer3 = (Student) inputStream.readObject();
            final Teacher deSer4 = (Teacher) inputStream.readObject();
            System.out.println("Deserialization completed successfully: \n" + deSer + "\n" + deSer1 + "\n" + deSer2 + "\n" + deSer3 + "\n" + deSer4);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
