package grades;

import java.util.AbstractList;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }

    public AbstractList<Integer> getGrades() {
        return grades;
    }
}

