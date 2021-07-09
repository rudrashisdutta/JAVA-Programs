package WebTechJAVA.pooja;

import java.util.Scanner;

class WeightOfString {
    static Scanner scanner = new Scanner(System.in);

    static boolean checkIfToIgnore(char c) {
        boolean ifIgnore = true;
        int cInt = (int) c;
        if (cInt >= 65 && cInt <= 90) {
            ifIgnore = false;
        }
        if (cInt == 65 || cInt == 69 || cInt == 73 || cInt == 79 || cInt == 85) {
            ifIgnore = true;
        }
        return ifIgnore;
    }

    static int weight(String str) {
        int weight = 0;
        for (int i = 0; i < str.length(); i++) {
            char cStr = str.charAt(i);
            if (!checkIfToIgnore(cStr)) {
                weight += (((int) cStr) - 64);
            }
        }
        return weight;
    }

    public static void main(String[] args) {
        String str;
        System.out.print("ENter the string:  ");
        str = scanner.nextLine();
        int weightOfStr = weight(str.toUpperCase());
        System.out.println(
                "The weight of the string " + str + " keeping in mind all the given rules is:  " + weightOfStr);
    }
}