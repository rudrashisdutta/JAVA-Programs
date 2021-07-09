/*package WebTechJAVA.LAB.LabTest;

import java.util.Scanner;

public class account {

    private class BankAccount {

        private Scanner scanner = new Scanner(System.in);
        private int acc_no;
        private double balance;
        private String name;

        public void enterTheData() {
            System.out.print("Enter the account number:\t");
            acc_no = scanner.nextInt();
            System.out.print("Enter the name of the account holder:\t");
            scanner.nextLine();
            name = scanner.nextLine();
            System.out.print("Enter the balance:\t");
            balance = scanner.nextDouble();
        }
        public void showData(){
            System.out.println("Account Number:\t"+acc_no+"\nAccount Holder Name:\t"+name+"\nBalance:\t"+balance);
        }
        private static void moreBalance(BankAccount b1,BankAccount b2){
            if(b1.balance > b2.balance){
                b1.showData();
            }
            else{
                b2.showData();
            }
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        System.out.println("Enter the data for account 1:");
        b1.enterTheData();
    }
}*/