package ooplab7;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // create object as Student
        Student s1 = new Student ();
        s1.setId("111111111111");
        s1.setName("Boy Saiyai");
        s1.setMajor("Information System");
        s1.setGroup("IS221");

        Student s2 = new Student("222222222222",
                "Gril Saiyai",
                "Maketing",
                "MK221");
        showData(s1);
        showData(s2);


        Student s3 = new Student();
        s3 = inputData (s3);
        showData(s3);

    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student info:");
        System.out.print("Enter student ID:");
        s.setId(scanner.nextLine());
        System.out.print("Enter student name:");
        s.setName(scanner.nextLine());
        System.out.println("Enter student major:");
        s.setMajor(scanner.nextLine());
        System.out.println("Enter student group:");
        s.setGroup(scanner.nextLine());
        return s;
    }


    private static void showData(Student s) {
        System.out.println("Student info: ");
        System.out.println("ID :" + s.getId());
        System.out.println("Name :" + s.getName());
        System.out.println("Major :" + s.getMajor());
        System.out.println("Group :" + s.getGroup());
        System.out.println("-------------" );




    }//showData
}//class
