package model;

import java.util.HashMap;
import java.util.Map;


public class SalesRepresentative extends Employee {
  Map<String, Customer> bankCustomers = new HashMap<>();

    public SalesRepresentative(String fullName, String email, String phoneNumber, String id) {
        super(fullName, email, phoneNumber, id);
    }

  @Override
  public void signIn() {
    System.out.println("Representative: " +(fullName) + " is signing in...");
  }

  @Override
  public void signOut() {
    System.out.println("Representative: " +(fullName) + " is signing out...");
  }

  public void attendCustomer () {
        System.out.println("Hi, how may I help you?");
    }

    public void openCustomerAccount (String fullName, String email,String phoneNumber, String address, String id,
                                     int creditScore, int creditCardNumber, double moneyInBank, double amount) {
      int counter = 0;
      counter++;
      bankCustomers.put(String.valueOf(counter), new Customer(fullName,email, phoneNumber, address, id, creditScore,
              creditCardNumber, moneyInBank));
      processDeposits(amount, moneyInBank);
      System.out.println("Your account was successfully open!");
    }

    public double processDeposits (double amount, double moneyInBank) {
       moneyInBank += amount;
       System.out.println("Deposit was made. Your current balance is: " + moneyInBank);
       return moneyInBank;
    }

    public double processWithdrawal (double amount, double moneyInBank) {
      if (moneyInBank >= amount) {
        moneyInBank -= amount;
        System.out.println("Withdrawal was made. Your current balance is: " + moneyInBank);
      }
      return moneyInBank;
    }

    private boolean checkCustomerCreditScore (Customer customer) {
       if (customer.getCreditScore() >= 170) {
         System.out.println("You have a good credit score");
         return true;
       } else {
         System.out.println("Your credit score is below 170");
         return false;
       }
    }

    public void processCustomerRequestLoan (Customer customer, double amount) {
      if (checkCustomerCreditScore(customer) && !customer.hasLoan()) {
        System.out.println("Processing your request for a: $" + amount);
        processDeposits(amount, customer.getMoneyInBank());
      }
      else {
        System.out.println("I am sorry, we cannot process your request.");
      }
    }

    public void closeCustomerAccount (Customer customer) {
      for (Map.Entry<String, Customer> entry: bankCustomers.entrySet()) {
        if (entry.getValue().equals(customer.getEmail())) {
          bankCustomers.remove(entry.getValue());
        }
      }
    }
}
