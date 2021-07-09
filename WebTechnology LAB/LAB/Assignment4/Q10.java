package WebTechJAVA.LAB.Assignment4;

public class Q10 {
    private static String checker(int n, String str) {
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((n + "").equals(str.charAt(i) + "")) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            str += n;
        }
        return str;
    }

    public static void main(String[] args) {
        int number = 123291417, n;
        String numS = "";
        n = number;
        while (n != 0) {
            numS = checker(n % 10, numS);
            n /= 10;
        }
        System.out.println(numS.length());
    }
}