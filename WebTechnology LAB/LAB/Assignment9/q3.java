package WebTechJAVA.LAB.Assignment9;

public class q3 {
    public static void main(String[] args) {

        int[] arr = new int[4];

        try {
            int i = arr[4];
            System.out.println("Inside try block" + i);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught in catch block");
        } finally {
            System.out.println("finally block executed");
        }
        System.out.println("Outside try-catch-finally clause");
    }
}