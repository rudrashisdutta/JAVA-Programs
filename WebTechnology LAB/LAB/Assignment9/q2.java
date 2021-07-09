package WebTechJAVA.LAB.Assignment9;

class SupersubCatchQ2 {

    public static void main(String args[]) {
        try {
            int a;
            int b = 0;
            a = 1 / b;
            System.out.print(a);
        } catch (Exception c) {
            System.out.println("Generic exception Catch");
        } /*
           * catch (ArithmeticException d) {
           * System.out.println("This statement is never executed"); }
           */
        // THIS CATCH BLOCK IS NEVER REACHED (SO ERROR OCCURS) because subclass catch
        // block should be places before superclass catch block
        System.out.println("After try/catch Blocks");
    }
}