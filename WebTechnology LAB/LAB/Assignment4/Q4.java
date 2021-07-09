package WebTechJAVA.LAB.Assignment4;

public class Q4 {
    private static char changeCase(char ch) {
        if (Character.isUpperCase(ch)) {
            return Character.toLowerCase(ch);
        } else {
            return Character.toUpperCase(ch);
        }
    }

    private static char changeCaseWithoutClass(char ch) {
        int x = (int) ch;
        if (x >= 65 && x <= 90) {
            return (char) ((int) ch + (int) 32);
        } else {
            return (char) ((int) ch - (int) 32);
        }
    }

    public static void main(String[] args) {
        char ch1 = 'a', ch2 = 'M';
        System.out.println(ch1 + "->" + changeCase(ch1));
        System.out.println(ch2 + "->" + changeCase(ch2));
        System.out.println("Without using character class: " + ch1 + "->" + changeCaseWithoutClass(ch1));
        System.out.println("Without using character class: " + ch2 + "->" + changeCaseWithoutClass(ch2));
    }
}