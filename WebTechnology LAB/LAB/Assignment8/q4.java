/*package WebTechJAVA.LAB.Assignment8;

import java.util.Scanner;

class Sales extends  {

    double basic;

    public Sales(int empid, String ename, double basic) {
        super(empid, ename);
        this.basic = basic;
    }

    double toAllowance() {
        double total = earnings(basic);
        return (total + total * 5 / 100);
    }

    void display() {
        System.out.println("The total earnings of sales person with empId " + empid + " is " + toAllowance());
    }
}
public class q5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int empId;
        double basic;
        System.out.println("Enter name of Sales person: ");
        name = in.nextLine();
        System.out.println("Enter empId of Sales person: ");
        empId = in.nextInt();
        System.out.println("Enter basic salary of Sales person: ");
        basic = in.nextDouble();
        Sales sales = new Sales(empId,name,basic);
        sales.display();
    }
}*/