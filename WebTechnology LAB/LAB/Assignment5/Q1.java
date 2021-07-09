package WebTechJAVA.LAB.Assignment5;

import java.util.Scanner;

public class Q1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name, branch;
        int roll;
        System.out.print("Enter your name:\t");
        name = scanner.nextLine();

        System.out.print("Enter your roll number:\t");
        roll = scanner.nextInt();
        System.out.print("Enter your branch:\t");
        scanner.nextLine();
        branch = scanner.nextLine();
        System.out.print("Name:\t" + name + "\nBranch:\t" + branch + "\nRoll Number:\t" + roll);
    }
}