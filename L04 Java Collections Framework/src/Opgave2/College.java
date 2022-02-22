package Opgave2;

import java.util.*;

public class College {
    private String name;

//Forskellen på == og equals() er at
// == tjekker om de peger på det samme
// equals() Tjekker og de har den samme værdi




//I opgaverne ændere du denne fra Arraylist til HashSet til HashMap
// I Arraylist kan man bruge normale og enhanced forloops
// I HashSets skal man bruge enhanced forloops
// I HashMaps skal man bruge enhanced forloops med .values() bagefter
   private Map<Integer,Student> students = new HashMap();
//   private List<Student> students = new ArrayList<>();
//   private Set<Student> students = new HashSet<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        students.put(student.getStudentNo(),student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public double calcAverage(){
        double avg = 0;
        double count = 0;
        for (Student student : students.values()) {
            for (int j = 0; j < student.getGrades().size(); j++) {
                avg += student.getGrades().get(j);
                count++;

            }

        }
        return avg/count;
    }

// Sådan kan man finde ting hvis de er gemt i et map
    public Student findStudentMap(int studentNo){
        return students.get(studentNo);
    }

// sådan ville man finde en student i en Arrayllist og et hashset (Bare uden .values())
    public Student findStudent(int studentNo){
        Student student = null;
        for (Student s : students.values()){
            if (studentNo == s.getStudentNo()){
                student = s;
            }
        }
        return student;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                '}';
    }
}
