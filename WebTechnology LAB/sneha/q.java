package WebTechJAVA.sneha;

import java.util.Scanner;

class Student {
    static String name;
    static int roll_no;
    static Scanner scanner = new Scanner(System.in);

    Student() {
        System.out.println("Enter the name and roll number: ");
        name = scanner.nextLine();
        roll_no = scanner.nextInt();
    }

    static void display() {
        System.out.println("\n\nName: " + name + "\nRoll number: " + roll_no);
    }
}

class Teacher extends Student {
    static String tname, subject;

    Teacher() {
        System.out.println("\nEnter the name and subject: ");
        scanner.nextLine();
        tname = scanner.nextLine();
        subject = scanner.nextLine();
    }

    static void display() {
        System.out.println("\n\nName: " + tname + "\nSubject: " + subject);
    }
}

class Info extends Teacher {
    static void display() {
        System.out.println("\n\nInformation of student-\nName: " + name + "\nRoll number: " + roll_no + "Teacher name: "
                + tname + "\nSubject: " + subject);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student.display();
        Teacher.display();
        display();
        t.equals(t); //ignore this line ITS SHIT
        
    }
}