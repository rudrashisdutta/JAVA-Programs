package WebTechJAVA.LAB.Assignment5;

import java.util.Scanner;

public class Q6 {
    private static Scanner scanner = new Scanner(System.in);

    private static String checker(int n, String str) {
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((n + "").equals(str.charAt(i) + "")) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            str += n;
        }
        return str;
    }

    public static void main(String[] args) {
        int number, n;
        System.out.print("Enter a number:\t");
        number = scanner.nextInt();
        String numS = "";
        n = number;
        while (n != 0) {
            numS = checker(n % 10, numS);
            n /= 10;
        }
        System.out.println(numS.length());
    }
}
