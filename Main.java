import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Группа 1", 1, List.of(4, 5, 3, 4)));
        students.add(new Student("Мария", "Группа 1", 1, List.of(2, 2, 3, 2)));
        students.add(new Student("Петр", "Группа 2", 2, List.of(5, 4, 5, 5)));
        students.add(new Student("Ольга", "Группа 3", 3, List.of(3, 3, 5, 3)));
        students.add(new Student("Павел", "Группа 2", 3, List.of(3, 3, 3, 5)));
        students.add(new Student("Максим", "Группа 3", 2, List.of(4, 3, 3, 3)));
        students.add(new Student("Кекс ", "Группа 2", 1, List.of(3, 3, 4, 3)));

        processStudents(students);
        printStudents(students, 2);

        System.out.println(students.toString());
    }

    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.advanceCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("курс " + course + " студент: " + student.getName());
            }
        }
    }
}
