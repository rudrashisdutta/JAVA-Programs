package WebTechJAVA.LAB.Assignment7;

import java.util.*;

class Account {
    String acc_no;
    double balance;

    Account(String a, double b) {
        acc_no = a;
        balance = b;
    }

    void disp() {
        System.out.println(acc_no + "\t\t" + balance);
    }
}

class Person extends Account {
    String name, aadhar_no;

    Person(String n, String ad, String a, double b) {
        super(a, b);
        name = n;
        aadhar_no = ad;
    }

    void disp() {
        System.out.print(name + "\t" + aadhar_no + "\t\t");
        super.disp();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Person ob1 = new Person("ABC", "123", "11", 1000.0), 
                ob3 = new Person("GH", "987", "121", 8832.5), 
                ob5 = new Person("XYZ", "1234567", "2441139", 9999.99);
        System.out.println("Name\tAadhar\t\tAccount No\tBalance");
        ob1.disp();
        ob3.disp();
        ob5.disp();
        sc.close();
    }
}