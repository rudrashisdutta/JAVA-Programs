package WebTechJAVA.LAB.Assignment10;

import java.util.Scanner;

public class q1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String s = scanner.nextLine();
        int l = s.length();
        String s1 = "", s2 = "";
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == ' ') {
                s1 = s.substring(0, i);
                s2 = s.substring(i + 1);
            }
        }
        System.out.println(s1 + " Kumar " + s2);
        scanner.close();
    }
}