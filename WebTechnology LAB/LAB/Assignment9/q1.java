package WebTechJAVA.LAB.Assignment9;

public class q1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.print(a[i] + " ");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
            System.out.println("Array out of bounds exception created!");
        }
    }
}