package WebTechJAVA.LAB.Assignment7;

import java.util.*;

class wb extends box {
    int thick;

    wb() {
        System.out.println("Inside Wooden Box Class");
    }

    void inputwb(int t) {
        thick = t;
    }

    int vol() {
        return length * width * height * thick;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.print("Enter width : ");
        int w = sc.nextInt();
        System.out.print("Enter height : ");
        int h = sc.nextInt();
        System.out.print("Enter thickness : ");
        int t = sc.nextInt();
        wb obj = new wb();
        obj.inputp(l, w);
        obj.inputb(h);
        obj.inputwb(t);
        System.out.println("Volume = " + obj.vol());
        sc.close();
    }
}

class box extends plate {
    int height;

    box() {
        System.out.println("Inside Box Class");
    }

    void inputb(int h) {
        height = h;
    }
}

class plate {
    int length, width;

    plate() {
        System.out.println("Inside Plate Class");
    }

    void inputp(int l, int w) {
        length = l;
        width = w;
    }
}