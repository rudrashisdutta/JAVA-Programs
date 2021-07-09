package WebTechJAVA.LAB.Assignment4;

public class Q5 {
    public static void main(String[] args) {
        char ch1 = 't', ch2 = 'S';
        ch1 = Character.toLowerCase(ch1);
        ch2 = Character.toLowerCase(ch2);
        if (ch1 < ch2) {
            System.out.println(ch1 + "  " + ch2);
        } else {
            System.out.println(ch2 + "  " + ch1);
        }
    }
}