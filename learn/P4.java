package learn;

import java.util.Scanner;

public class P4 {

    static String reverseString(String value) {
        String result = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            result += value.charAt(i);
        }
        return result;
    }

    static String compareString(String value1, String value2) {
        String result = "is equal";
        if (value1.length() == value2.length()) {
            for (int i = 0; i < value1.length(); i++) {
                if (value1.charAt(i) != value2.charAt(i)) {
                    result = "is not equal";
                    break;
                }
            }
        } else {
            result = "is not equal";
        }
        return result;
    }

    static String concatenate(String value1, String value2) {
        return value1 + value2;
    }

    static String changeCase(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            if (Character.isLowerCase(value.charAt(i))) {
                result += Character.toUpperCase(value.charAt(i));
            } else if (Character.isUpperCase(value.charAt(i))) {
                result += Character.toLowerCase(value.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        reverseString(str);
        System.out.println("Reverse of " + str + " is: " + reverseString(str) + "\n\n" + str + " "
                + compareString(str, str1) + " " + str1 + "\nAfter changing case: " + changeCase(str)
                + "\nConctenated String: " + concatenate(str, str1));
        scanner.close();
    }
}