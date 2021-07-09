package learn;

class X {
    public static void main(String[] args) {
        try {
            Method();
            System.out.println("A");
        } catch (Exception ex) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void Method() {
        throw new Error();
    }
}

class Compute {
    public static void main(String[] args) {
        try {
            return;
        } catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
    }
}