package WebTechJAVA.LAB.Assignment10;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name 1 : ");
        String string1 = scanner.nextLine();
        System.out.print("Enter name 2 : ");
        String string2 = scanner.nextLine();
        int x1 = string1.lastIndexOf(" ");
        int x2 = string2.lastIndexOf(" ");
        System.out.println(string1.substring(0, x1) + string2.substring(x2));
        System.out.println(string2.substring(0, x2) + string1.substring(x1));
        scanner.close();
    }
}