package com.epam.test;

public class Student {
    String firstName ="";
    String lastName ="";
    int expectedYear =0;
    double gpa =0;
    boolean declaredMajor;

    public Student(String firstName, String lastName, int expectedYear, double gpa, boolean declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYear = expectedYear;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public void incrementExpectedGraduationYear(){
        this.expectedYear++;
        System.out.println(expectedYear);
    }

    public static void main(String[] args) {
        Student student = new Student("Oscar", "Maestro", 2022, 20.3, true);
        Student student2 = new Student("Daniel", "Maestro", 2022, 20.3, true);
        student.incrementExpectedGraduationYear();
    }

}
