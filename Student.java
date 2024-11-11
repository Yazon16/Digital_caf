import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(){
        this.name = "0";
        this.group = "0";
        this.course = 0;
        this.grades = Collections.singletonList(0);
    }

    public Student(String name, String group, int course, List<Integer> grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup(){
        return group;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void advanceCourse() {
        this.course++;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades  +
                '}' + "\n";
    }
}
