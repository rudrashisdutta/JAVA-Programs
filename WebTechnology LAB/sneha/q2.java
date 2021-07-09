package WebTechJAVA.sneha;

import java.util.Scanner;

interface permutation {
    public double findPermutation(int n, int r);
}

interface combination {
    public double findCombination(int n, int r);
}

interface NPRnNCR extends permutation, combination {
    int fact(int n);
}

public class q2 implements NPRnNCR {

    static Scanner scanner = new Scanner(System.in);

    @Override
    public int fact(int n) {
        int f = 1;
        int j = 1;
        while (j <= n) {
            f = f * j;
            j++;
        }
        return f;
    }

    @Override
    public double findPermutation(int n, int r) {
        double p;
        p = (double) fact(n) / (double) fact(n - r);
        return p;
    }

    @Override
    public double findCombination(int n, int r) {
        double c, x;
        x = (double) fact(n - r) * (double) fact(r);
        c = (double) fact(n) / x;
        return c;
    }

    public static void main(String[] args) {
        int n, r;
        System.out.println("Enter 'n' and 'r'");
        n = scanner.nextInt();
        r = scanner.nextInt();
        q2 x = new q2();
        double perm = x.findPermutation(n, r);
        double comb = x.findCombination(n, r);
        System.out.println("Permutation = " + perm + "\nCombination = " + comb);
    }

}