package WebTechJAVA.FinalLabSessional.Q1;

import java.util.Scanner;

interface PersonalLoan {
    float find_Simple_Interrest(float principle, int year);
}

class Bank1 implements PersonalLoan {
    static int interest_rate = 10;

    public float find_Simple_Interrest(float principle, int year) {
        return principle * interest_rate * year / 100;
    }
}

class Bank2 implements PersonalLoan {
    static int interest_rate = 15;

    public float find_Simple_Interrest(float principle, int year) {
        return principle * interest_rate * year / 100;
    }
}

class loan {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        float principle;
        int years;
        System.out.print("Enter the Principle:  ");
        principle = scanner.nextFloat();
        System.out.print("Enter the number of years:  ");
        years = scanner.nextInt();
        Bank1 b1 = new Bank1();
        System.out.println("Interest for Bank1 : " + b1.find_Simple_Interrest(principle, years));
        Bank2 b2 = new Bank2();
        System.out.println("Interest for Bank2 : " + b2.find_Simple_Interrest(principle, years));
    }
}