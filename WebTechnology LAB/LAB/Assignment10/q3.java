package WebTechJAVA.LAB.Assignment10;

import java.util.Scanner;

public class q3 {

    static Scanner scanner = new Scanner(System.in);

    static String reverseString(String value) {
        String result = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            result += value.charAt(i);
        }
        return result;
    }

    static String compareString(String value1, String value2) {
        String result = "is equal";
        if (!value1.equals(value2)) {
            result = "is not equal";
        }
        return result;
    }

    static String insert(String value1) {
        String s1 = "", s2 = "";
        for (int i = 0; i < value1.length(); i++) {
            if (value1.charAt(i) == ' ') {
                s1 = value1.substring(0, i);
                s2 = value1.substring(i + 1);
                break;
            }
        }
        String insertWord;
        System.out.print("Enter a string to be inserted in between \"Hello World\": ");
        insertWord = scanner.nextLine();
        return s1 + " " + insertWord + " " + s2;
    }

    static String changeCase(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            if (Character.isLowerCase(value.charAt(i))) {
                result += Character.toUpperCase(value.charAt(i));
            } else if (Character.isUpperCase(value.charAt(i))) {
                result += Character.toLowerCase(value.charAt(i));
            } else {
                result += value.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Insert 2 strings:\n");
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        String ins;
        ins = insert("Hello World");
        System.out.println(
                "\n\nReverse of " + str + " is: " + reverseString(str) + "\n\n" + str + " " + compareString(str, str1)
                        + " " + str1 + "\nAfter changing case: " + changeCase(str) + "\nInserted String: " + ins);
        scanner.close();
    }
}

/*
 * if (value1.length() == value2.length()) { for (int i = 0; i <
 * value1.length(); i++) { if (value1.charAt(i) != value2.charAt(i)) { result =
 * "is not equal"; break; } } } else { result = "is not equal"; }
 */