package studentmanagementsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao = new StudentDAO();

        System.out.println("===== Student Management System =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Student student = new Student(name, department, email, marks);

        dao.addStudent(student);

        sc.close();

    }

}