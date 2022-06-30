

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {

        Course course1 = new Course("1");
        Course course2 = new Course("2");
        Course course3 = new Course("3");
        Course course4 = new Course("4");
        Course course5 = new Course("5");
        Course course6 = new Course("6");

        Student student1 = new Student("Студент_1", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("Студент_2", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Студент_3", Arrays.asList(course1, course2, course4));
        Student student4 = new Student("Студент_4", Arrays.asList(course2, course4, course6, course1, course3, course5));
        Student student5 = new Student("Студент_5", Arrays.asList(course3, course1, course4));
        Student student6 = new Student("Студент_6", Arrays.asList(course1, course3, course5, course2));

        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("1"),
                new Course("2"),
                new Course("3"),
                new Course("4"),
                new Course("5"),
                new Course("6"));
    }
}
