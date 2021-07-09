package WebTechJAVA.LAB.LabTest;

import java.util.Scanner;

public class BankAccount {
    int acc_no;
    String name;
    double balance;
    private Scanner scanner = new Scanner(System.in);

    BankAccount() {
        System.out.print("Enter the account number:\t");
        acc_no = scanner.nextInt();
        System.out.print("Enter the name of the account holder:\t");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter the balance:\t");
        balance = scanner.nextDouble();
    }

    public static void displayBankAccountDetails(BankAccount ba) {
        System.out.println("Name:- " + ba.name);
        System.out.println("Account Number:- " + ba.acc_no);
        System.out.println("Balance :- " + ba.balance);

    }

    public static void checkForMoreBalance(BankAccount ba1, BankAccount ba2) {
        if (ba1.balance > ba2.balance) {
            System.out.println(ba1.name + " Has more Balance in his/her Account");
        } else {
            System.out.println(ba2.name + " Has more Balance in his/her Account");
        }
    }

    public static void main(String args[]) {
        System.out.println("For The 1st Person :");
        BankAccount bankAccount1 = new BankAccount();
        System.out.println("For The 2nd Person :");
        BankAccount bankAccount2 = new BankAccount();
        System.out.println("For The 1st Person :");
        displayBankAccountDetails(bankAccount1);
        System.out.println("-------------------------------------");
        System.out.println("For The 2nd Person :");
        displayBankAccountDetails(bankAccount2);
        checkForMoreBalance(bankAccount1, bankAccount2);
    }
}