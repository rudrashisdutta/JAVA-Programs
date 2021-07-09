package WebTechJAVA.LAB.Assignment5;

import java.util.Scanner;

public class Q7 {
    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the lower range : ");
        int p = scanner.nextInt();
        System.out.print("Enter the upper range : ");
        int q = scanner.nextInt();

        if (p > q)
            System.out.println("Invalid Range !");
        else {
            System.out.println("\nThe Twin Prime Numbers are : ");
            for (int i = p; i <= (q - 2); i++) {
                if (isPrime(i) == true && isPrime(i + 2) == true) {
                    System.out.print("(" + i + "," + (i + 2) + ") ");
                }
            }
        }
    }
}