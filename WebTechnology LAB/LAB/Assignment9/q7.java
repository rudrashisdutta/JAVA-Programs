package WebTechJAVA.LAB.Assignment9;

import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.menu();
        System.out.println("EXITED!");
        BankAccount.scanner.close();
    }
}

class BankAccount {
    public static Scanner scanner = new Scanner(System.in);
    private static double MINIMUM_BALANCE = 500;
    private double balance = 500;

    BankAccount() {
        System.out.println("\n\n" + MINIMUM_BALANCE
                + " rupees has been added to your bank account as your minimum required balance!\nThank you for choosing our bank services! :)\n");
    }

    private void deposit(double ammount) {
        balance += ammount;
        System.out.println("\n" + ammount + " rupees has been deposited in your bank account.\nOld Bank Balance:"
                + (balance - ammount) + "\nNew Bank Balance: " + balance);
    }

    private void withdraw(double ammount) {
        try {
            if ((balance - ammount) < MINIMUM_BALANCE) {
                throw new LessBalanceException(balance, balance - ammount);
            }
            balance -= ammount;
            System.out.println("\n" + ammount + " rupees has been withdrawn from your bank account.\nOld Bank Balance:"
                    + (balance + ammount) + "\nNew Bank Balance: " + balance);
        } catch (LessBalanceException lessBalanceException) {
            lessBalanceException.printStackTrace();
        }
    }

    private void getBalance() {
        System.out.println("\nBank Balance: " + balance);
    }

    private static double enterAmmountSecurely(Scanner scanner) {
        return scanner.nextDouble();
    }

    public void menu() {
        int choice;
        while (true) {
            System.out.print(
                    "\nPRESS:\n1: SHOW BANK BALANCE\n2: DEPOSIT AN AMMOUNT\n3: WITHDRAW AN AMMOUNT\n4: EXIT\nYOUR CHOICE: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                getBalance();
            } else if (choice == 2) {
                System.out.print("Enter the ammount to be deposited to you bank account: ");
                deposit(BankAccount.enterAmmountSecurely(scanner));
            } else if (choice == 3) {
                System.out.print("Enter the ammount to be withdrawn from your bank account: ");
                withdraw(BankAccount.enterAmmountSecurely(scanner));
            } else if (choice == 4) {
                System.out.println("\n\nEXIT FUNCTION ON INITIATION!");
                break;
            } else {
                System.out.println("\n\nTHIS IS A WRONG CHOICE!\nCHOOSE AGAIN!\n\n\n");
            }
        }
    }
}

class LessBalanceException extends Exception {
    private static final long serialVersionUID = 1L;
    double oldBalance, newBalance;

    LessBalanceException(double oldBalance, double newBalance) {
        this.newBalance = newBalance;
        this.oldBalance = oldBalance;
    }

    public void printStackTrace() {
        System.out.println(
                "THIS WITHRADAWAL CANNOT BE PROCCESSED! BALANCE REMAINING WILL BE LESS THAN THE MINIMUM BALANCE (500).\nCurrent Balance: "
                        + oldBalance + "\nBalance if withdrawn: " + newBalance);
    }
}