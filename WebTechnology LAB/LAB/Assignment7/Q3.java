package WebTechJAVA.LAB.Assignment7;

import java.util.*;

class Shape {
    double area;

    double showArea() {
        return area;
    }
}

class Circle extends Shape {
    void cal(double r) {
        area = 22 / 7.0 * r * r;
    }

    public static void main(String args[]) {
        Circle ob = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double R = sc.nextDouble();
        ob.cal(R);
        System.out.println("Area of Circle = " + ob.showArea());
        sc.close();
    }
}

class Rectangle extends Shape {
    void cal(double l, double b) {
        area = l * b;
    }

    public static void main(String args[]) {
        Rectangle ob = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length & Breadth: ");
        double x = sc.nextDouble(), y = sc.nextDouble();
        ob.cal(x, y);
        System.out.println("Area of Rectangle = " + ob.showArea());
        sc.close();
    }
}