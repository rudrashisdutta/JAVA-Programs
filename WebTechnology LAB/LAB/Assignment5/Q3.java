package WebTechJAVA.LAB.Assignment5;

import java.util.Scanner;

public class Q3 {
    private static Scanner scanner = new Scanner(System.in);

    static int multiply(int x, int y) {
        if (y == 0)
            return 0;
        if (y > 0)
            return (x + multiply(x, y - 1));
        if (y < 0)
            return -multiply(x, -y);
        return -1;
    }

    public static void main(String[] args) {
        int number1, number2;
        System.out.print("Enter the first number:\t");
        number1 = scanner.nextInt();
        System.out.print("Enter the second number:\t");
        number2 = scanner.nextInt();
        System.out.print("\n" + multiply(number1, number2));
    }
}