package WebTechJAVA.LAB.Assignment4;

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of the student:\t");
        m = sc.nextInt();
        sc.close();
        if (m > 90 && m <= 100)
            System.out.println("O");
        else if (m >= 80 && m < 90)
            System.out.println("E");
        else if (m >= 70 && m < 80)
            System.out.println("A");
        else if (m >= 60 && m < 70)
            System.out.println("B");
        else if (m >= 50 && m < 60)
            System.out.println("C");
        else if (m >= 40 && m < 50)
            System.out.println("D");
        else if (m < 40)
            System.out.println("FAIL");
    }
}