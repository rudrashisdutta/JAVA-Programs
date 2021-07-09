package WebTechJAVA.ClassW;

public class P1 {
    public static void main(String[] args) {
        int a = 10;
        println((a++ + ++a) + "");
    }

    private static void println(String str) {
        System.out.println(str);
    }
}