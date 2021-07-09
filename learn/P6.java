package learn;

import java.util.Scanner;;

class Complex {
    static Scanner scanner = new Scanner(System.in);
    int real, imaginery;

    Complex() {
        System.out.print("Enter the real part:  ");
        real = scanner.nextInt();
        System.out.print("Enter the imaginery part:  ");
        imaginery = scanner.nextInt();
    }

    Complex(Complex complex1, Complex complex2) {
        real = complex1.real + complex2.real;
        imaginery = complex1.imaginery + complex2.imaginery;
    }

    public String printComplex() {
        return (real + " + " + imaginery + "i");
    }

}

public class P6 {
    public static void main(String[] args) {
        System.out.println("Enter the first complex number:\n");
        Complex complex1 = new Complex();
        System.out.println("\n\nEnter the second complex number:\n");
        Complex complex2 = new Complex();
        Complex complex3 = new Complex(complex1, complex2);
        System.out.println(
                "\n\n" + complex1.printComplex() + " + " + complex2.printComplex() + " = " + complex3.printComplex());
    }
}