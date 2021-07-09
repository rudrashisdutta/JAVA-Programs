package WebTechJAVA.ClassW;

import java.util.Scanner;

public class P3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name, roll;
        double marks;
        System.out.print("Enter the name of the student:\t");
        name = scanner.nextLine();

        System.out.print("Enter the percentage of the student:\t");
        marks = scanner.nextDouble();
        System.out.print("Enter the roll of the student:\t");
        scanner.nextLine();
        roll = scanner.nextLine();
        System.out.print("Name:\t" + name + "\nRoll:\t" + roll + "\nPercentage:\t" + marks);
    }
}