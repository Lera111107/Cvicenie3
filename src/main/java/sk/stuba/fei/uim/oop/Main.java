package sk.stuba.fei.uim.oop;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student prviStudent = new Student("Sergio");
        Student druhiStudent = new Student("Dafni");
        Student tretiStudent = new Student("Edgar");

        ArrayList<Student> zoznamStudentov = new ArrayList<>();
        zoznamStudentov.add(prviStudent);
        zoznamStudentov.add(druhiStudent);
        zoznamStudentov.add(tretiStudent);
        zoznamStudentov.toString();


        int value = 0;
        System.out.println("Zoznam zadanych studentov: ");
        while (zoznamStudentov.size() > value) {

            System.out.print(" " + zoznamStudentov.get(value));
            value++ ;
        }
    }

}
