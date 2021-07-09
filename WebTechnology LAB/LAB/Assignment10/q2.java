package WebTechJAVA.LAB.Assignment10;

import java.util.Scanner;

public class q2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str1, str2;
        System.out.print("Enter the first string (two words):  ");
        str1 = scanner.nextLine();
        str1 = str1.trim();
        str1 += " ";
        System.out.print("Enter the second string (two words):  ");
        str2 = scanner.nextLine();
        str2 = str2.trim();
        String result = str1 + str2;
        System.out.println("Concatenating the strings:\t" + result);
        String res = result + " ";
        int flag = 0;
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == ' ') {
                flag++;
                if (flag == 4) {
                    res = res.trim();
                    System.out.println("Sub-String " + flag + "-> " + res);
                    break;
                }
                System.out.println("Sub-String " + flag + "-> " + res.substring(0, i));
                res = res.substring(i + 1);
                i = 0;
            }
        }
    }
}
/*
 * for (int i = 0; i < res.length(); i++) { if (res.charAt(i) == ' ') {
 * System.out.println(res.substring(0, i)); res = res.substring(i + 1); i = 0; }
 * }
 */