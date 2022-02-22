package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int StudentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name, List<Integer> grades) {
        StudentNo = studentNo;
        this.name = name;
        this.grades = grades;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(int studentNo) {
        StudentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrades(int grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentNo=" + StudentNo +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
