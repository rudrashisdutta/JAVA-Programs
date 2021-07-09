package WebTechJAVA.LAB.Assignment5;

import java.util.Scanner;

public class Q8 {
    static int c;

    static int HailstoneNumbers(int N) {
        System.out.print(N + " ");

        if (N == 1 && c == 0) {
            return c;
        } else if (N == 1 && c != 0) {
            c++;
            return c;
        } else if (N % 2 == 0) {
            c++;
            HailstoneNumbers(N / 2);
        } else if (N % 2 != 0) {
            c++;
            HailstoneNumbers(3 * N + 1);
        }
        return c;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        N = scanner.nextInt();
        int x;
        x = HailstoneNumbers(N);
        System.out.println();
        System.out.println("Number of Steps: " + x);
    }
}