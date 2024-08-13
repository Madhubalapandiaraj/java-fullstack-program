package com.madhu;

import java.util.Scanner;

public class Student {
    int regNo;
    String stdName;
    int arr[] = new int[5];

    // Constructor
    Student(int regNo, String stdName) {
        this.regNo = regNo;
        this.stdName = stdName;
    }

    // Method to get marks from the user and store in array
    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }
    void displayGrade() {
        int sum = 0;
        for (int mark : arr) {
            sum += mark;
        }
        double average = sum / arr.length;
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Student Name: " + stdName);
        System.out.println("Register Number: " + regNo);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student(123, "Madhu"); 
        student.getMarks();
        student.displayGrade();
    }
}

