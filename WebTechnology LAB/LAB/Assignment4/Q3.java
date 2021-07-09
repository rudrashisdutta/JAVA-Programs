package WebTechJAVA.LAB.Assignment4;

public class Q3 {
    private static int unitPlace(int x) {
        return x % 10;
    }

    private static int hundredthPlace(int x) {
        return x / 100;
    }

    private static void check(int x) {
        if (unitPlace(x) == hundredthPlace(x)) {
            System.out.println("The number " + x + " is palindrome.");
        } else {
            System.out.println("The number " + x + " is not palindrome.");
        }
    }

    public static void main(String[] args) {
        check(122);
        check(121);
    }
}