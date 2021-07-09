package WebTechJAVA.LAB.Assignment4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:\t");
        number = sc.nextInt();
        sc.close();
        int sum = 0;
        int n = number;
        while (n % 10 != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(number + ">" + sum);
    }
}