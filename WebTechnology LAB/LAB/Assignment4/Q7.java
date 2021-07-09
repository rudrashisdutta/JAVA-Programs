package WebTechJAVA.LAB.Assignment4;

public class Q7 {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
                println("Monday");
                break;
            case 2:
                println("Tuesday");
                break;
            case 3:
                println("Wednesday");
                break;
            case 4:
                println("Thursday");
                break;
            case 5:
                println("Friday");
                break;
            default:
                println("Weekend");
                break;
        }
    }

    private static void println(String s) {
        System.out.println(s);
    }
}