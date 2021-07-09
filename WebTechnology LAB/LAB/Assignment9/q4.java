package WebTechJAVA.LAB.Assignment9;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Enter a number: ");
        a = scanner.nextInt();
        scanner.close();
        try {
            if (a < 0) {
                throw new NegativeNumberException();
            }
            System.out.println("\n" + 2 * a);
        } catch (NegativeNumberException negativeNumberException) {
            negativeNumberException.printStackTrace();
        }
    }
}

class NegativeNumberException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public void printStackTrace() {
        System.out.println("\nNegative Number is not allowed in this field!\nNegative Number Exception!");
    }
}