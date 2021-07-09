package learn;
import java.util.Scanner;

public class P1 {
    private static Scanner scanner = new Scanner(System.in);
    static public  void main(String[] args) {
        int x;
        String y,z;
        double c;
        System.out.print(":");
        y = scanner.nextLine();
        System.out.print("::");
        x = scanner.nextInt();
        scanner.nextLine();
        System.out.print(":::");
        
        z = scanner.nextLine();
        System.out.print("::::");
        c = scanner.nextDouble();
        System.out.println(y + x + z + c);
    }
}
class D{
    public static void main(String[] args) {
        
    }
}