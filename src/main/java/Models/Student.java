package Models;

import java.util.Arrays;

public class Student extends Person{
    private static String behaviour;
    private static double sessionAverage;
    private static int grade;
    private static int gradeFee;
    private String[] subjects;

    public Student(String name, int age, String address, int grade, int gradeFee, String[] subjects, String behaviour, double sessionAverage) {
        super(name, age, address);
        this.grade = grade;
        this.gradeFee = gradeFee;
        this.subjects = subjects;
        this.behaviour = behaviour;
        this.sessionAverage = sessionAverage;
    }

    public static String getBehaviour() {
        return behaviour;
    }

    public static void setBehaviour(String behaviour) {
        Student.behaviour = behaviour;
    }

    public static double getSessionAverage() {
        return sessionAverage;
    }

    public static void setSessionAverage(double sessionAverage) {
        Student.sessionAverage = sessionAverage;
    }

    public static int getGrade() {
        return grade;
    }

    public static void setGrade(int grade) {
        Student.grade = grade;
    }

    public static void setGradeFee(int grade) {
        Student.gradeFee = gradeFee;
    }

    public int getGradeFee() {
        return gradeFee;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + getName() +
                ", age = " + getAge()  +
                ", address = " + getAddress() +
                ", grade = " + getGrade()  +
                ", gradeFee = ₦" + gradeFee +
                ", subjects = " + Arrays.toString(subjects) +
                '}';
    }
}
