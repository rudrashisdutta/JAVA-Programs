package learn;

import java.util.Scanner;

public class P7 {
    static String USN;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the USN to be checked:  ");
        USN = scanner.nextLine();
        int flag = 0;
        if (USN.length() == 10) {
            char firstChar = USN.charAt(0);
            if (Character.isDigit(firstChar)) {
                if (firstChar == '1' || firstChar == '2') {
                    String str6thAnd7th;
                    str6thAnd7th = USN.substring(5, 7);
                    if (str6thAnd7th.equals("CS") || str6thAnd7th.equals("IS") || str6thAnd7th.equals("EC")
                            || str6thAnd7th.equals("ME")) {
                        char ch8th, ch9th, ch10th;
                        ch8th = USN.charAt(7);
                        ch9th = USN.charAt(8);
                        ch10th = USN.charAt(9);
                        if (Character.isDigit(ch8th) && Character.isDigit(ch9th) && Character.isDigit(ch10th)) {
                            System.out.println("SUCCESS");
                            flag = 1;
                        }
                    }
                }
            }
        }
        if (flag == 0) {
            System.out.println("FAILURE");
        }
    }
}
