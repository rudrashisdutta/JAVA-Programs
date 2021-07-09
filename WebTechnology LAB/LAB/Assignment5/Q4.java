package WebTechJAVA.LAB.Assignment5;

import java.util.Scanner;

public class Q4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str;
        System.out.print("Enter a character:\t");
        str = scanner.nextLine();
        int ascii = (int) str.charAt(0);
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
            System.out.println("It is a letter.");
        } else if (ascii >= 48 && ascii <= 57) {
            System.out.println("It is a number.");
        } else {
            System.out.println("It is a special char.");
        }
    }
}