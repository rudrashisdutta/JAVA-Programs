package WebTechJAVA.FinalLabSessional;

class SavingsAccount {
    static double annualInterestRate = 0.04;
    private double savingsBalance;

    SavingsAccount() {
        savingsBalance = 0;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.savingsBalance = 2000.00;
        saver2.savingsBalance = 3000.00;
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("First Month: \nSaver 1 = " + String.format("%.2f", saver1.savingsBalance) + " \nSaver 2 = "
                + String.format("%.2f", saver2.savingsBalance));
        modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Second Month: \nSaver 1 = " + String.format("%.2f", saver1.savingsBalance) + " \nSaver 2 = "
                + String.format("%.2f", saver2.savingsBalance));
    }

    void calculateMonthlyInterest() {
        savingsBalance = savingsBalance + ((savingsBalance * annualInterestRate) / 12);
    }

    static void modifyInterestRate(double rate) {
        annualInterestRate = rate;
    }
}