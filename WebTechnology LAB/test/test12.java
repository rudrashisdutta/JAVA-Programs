package WebTechJAVA.test;

import java.util.Scanner;
import java.lang.Math;

class NoTriangleException extends Exception {
    NoTriangleException(String S) {
        super(S);
    }
    
}
class Triangle {
    float a, b, c;
    double area;
    double s;
    float peri;

    Triangle() {
        a = 0;
        b = 0;
        c = 0;
    }

    Triangle(float x, float y, float z) {
        a = x;
        b = y;
        c = z;
    }
    void perimeter(float x, float y, float z) {
        a = x;
        b = y;
        c = z;
        peri = a + b + c;
        System.out.println("The perimeter of the triangle is " + peri);
        s = peri / 2;
    }
    void area(float x, float y, float z) {
        a = x;
        b = y;
        c = z;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is " + area);

    }
}

class test {
    public static void main(String args[]) {

        float s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of three sides of TRIANGLE");
        s1 = sc.nextFloat();
        s2 = sc.nextFloat();
        s3 = sc.nextFloat();
        sc.close();
        Triangle t1 = new Triangle(s1, s2, s3);
        
        try {
            if ((s1+s2 < s3) || (s2+s3 < s1) || (s1+s3 < s2))
                throw new NoTriangleException("Not Valid");
        } catch (NoTriangleException m) {
            System.out.println("Exception occured: " + m);
        }

        t1.perimeter(s1, s2, s3);
        t1.area(s1, s2, s3);
    }
}