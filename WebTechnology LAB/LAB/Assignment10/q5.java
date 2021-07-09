package WebTechJAVA.LAB.Assignment10;

import java.util.Scanner;

class TestUSN {

    private String USN;
    static Scanner scanner = new Scanner(System.in);

    TestUSN() {
        System.out.print("Enter the USN to be checked:  ");
        USN = scanner.nextLine();
    }

    private boolean checkLen10() {
        if (USN.length() == 10) {
            return true;
        }
        return false;
    }

    private boolean checkFirstCharIs1or2() {
        char firstChar = USN.charAt(0);
        if (Character.isDigit(firstChar)) {
            if (firstChar == '1' || firstChar == '2') {
                return true;
            }
        }
        return false;
    }

    private boolean check6thAnd7thChar() {
        String str6thAnd7th;
        str6thAnd7th = USN.substring(5, 7);
        if (str6thAnd7th.equals("CS") || str6thAnd7th.equals("IS") || str6thAnd7th.equals("EC")
                || str6thAnd7th.equals("ME")) {
            return true;
        }
        return false;
    }

    private boolean checkIfCharInBetween0to9(char c) {
        int cInt = Integer.parseInt(c + "");
        for (int i = 0; i < 10; i++) {
            if (cInt == i) {
                return true;
            }
        }
        return false;

    }

    private boolean check8th9thAnd10thCHar() {
        char ch8th, ch9th, ch10th;
        ch8th = USN.charAt(7);
        ch9th = USN.charAt(8);
        ch10th = USN.charAt(9);
        if (Character.isDigit(ch8th) && Character.isDigit(ch9th) && Character.isDigit(ch10th)) {
            if (checkIfCharInBetween0to9(ch8th) && checkIfCharInBetween0to9(ch9th)
                    && checkIfCharInBetween0to9(ch10th)) {
                return true;
            }
        }
        return false;
    }

    public void printIfSuccessOrFailure() {
        if (checkLen10()) {
            if (checkFirstCharIs1or2()) {
                if (check6thAnd7thChar()) {
                    if (check8th9thAnd10thCHar()) {
                        System.out.println("SUCCESS");
                        return;
                    }
                }
            }
        }
        System.out.println("FAILURE");
    }

    public static void main(String[] args) {
        TestUSN usn = new TestUSN();
        usn.printIfSuccessOrFailure();
    }
}