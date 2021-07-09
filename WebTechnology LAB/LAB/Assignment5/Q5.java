package WebTechJAVA.LAB.Assignment5;

import java.util.Scanner;

public class Q5 {
    private static Scanner scanner = new Scanner(System.in);

    private static void tableUpto15(int number) {
        for (int i = 1; i <= 15; i++) {
            System.out.print(number * i + "\t");
        }
    }

    public static void main(String[] args) {
        int number;
        System.out.print("Enter a number:\t");
        number = scanner.nextInt();
        tableUpto15(number);
    }
}