package WebTechJAVA.LAB.Assignment5;

import java.util.Scanner;

public class Q2 {
    public static boolean isArmstrong(int number) {
        boolean val;
        int n = number, a, c = 0, temp;
        temp = n;

        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            val = true;
        else
            val = false;
        return val;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        System.out.print("Enter a number:\t");
        number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println("The number " + number + " is an Armstrong number.");
        } else {
            System.out.println("The number " + number + " is not an Armstrong number.");
        }
    }
}
