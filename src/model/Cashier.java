package model;

public class Cashier extends Employee{

    public Cashier(String fullName, String email, String phoneNumber, String id) {
        super(fullName, email, phoneNumber, id);
    }

    public void attendCustomer () {
        System.out.println("Hi, how may I help you?");
    }

    public double processDeposits (Customer customer, double amount) {
        System.out.println("Your deposit was made successfully!");
        return customer.getMoneyInBank() + amount;
    }

    public double processWithdrawal (Customer customer, double amount) {
       if (customer.getMoneyInBank() <= amount) {
           System.out.println("Withdrawal was made. Your current balance is: $" + customer.getMoneyInBank());
           return customer.getMoneyInBank() - amount;
       } else {
           System.out.println("I am sorry, we cannot proceed your request. Current balance is less than withdrawal requested");
       }
       return customer.getMoneyInBank();
    }

    @Override
    public void signIn() {
        System.out.println("Cashier: " +(fullName) + " is signing in...");
    }

    @Override
    public void signOut() {
        System.out.println("Cashier: " +(fullName) + " is signing out...");
    }
}
