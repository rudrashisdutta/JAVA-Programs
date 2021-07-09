package WebTechJAVA.LAB.Assignment8;

import java.util.*;
interface ABC{
    public void earnings(int b);
    public void deductions(int s);
    public void bonus(int b2);
}
abstract class Manager implements ABC{
    public void earnings(int b){
        double e,da,hra;
        da = 0.8*b;
        hra = 0.15*b;
        e = b + da + hra;
        System.out.println("The annual earning of the staff is Rs " + e);
    }
    public void deductions(int s){
        double d = 0.12*s;
        System.out.println("The annual deductions is (12 % of earnings) Rs " + d);
    } 
}
class Substaff extends Manager{
    public void bonus(int b2){
        double bon = 0.5*b2;
        System.out.println("The annual bonus of the staff is Rs " + bon);
    }
}
public class q3
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic earning of the staff : ");
		int basic = sc.nextInt();
		Substaff s1 = new Substaff();
		s1.earnings(basic);
		s1.deductions(basic);
		s1.bonus(basic);
        sc.close();
	}
}