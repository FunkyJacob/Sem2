package Opgave2;

import java.util.List;

public class Opgave2 {
    public static void main(String[] args) {
        College howard = new College("howard");

        Student Jacob = new Student(69,"Jacob", List.of(4,7,12,10));
        Student Martin = new Student(70,"Martin", List.of(12,12,12,12));
        Student Jeppe = new Student(700,"Jepper", List.of(4,2,2,2));

        howard.addStudent(Martin);
        howard.addStudent(Jacob);
        howard.addStudent(Jeppe);

        System.out.println();

        System.out.println(howard.calcAverage());
        System.out.println();

        System.out.println( howard.findStudent(70));

        System.out.println();


    }

}
