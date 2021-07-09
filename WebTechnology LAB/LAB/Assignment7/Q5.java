package WebTechJAVA.LAB.Assignment7;

class Programming {

    public Programming() {
        System.out.println("Programming");
    }

    public Programming(int i, int j) {
        System.out.println("Programming + +");
    }
}

class DP extends Programming {

    public DP() {
        System.out.println("DP");
    }

    public DP(int i) {
        System.out.println("DP +");
    }

    public DP(int i, int j) {
        System.out.println("DP + +");
    }
}

public class Q5 {

    public static void main(String[] args) {
        DP obj = new DP(10);
        obj.equals(obj); // ignore this line
    }
}