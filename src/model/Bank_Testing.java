package model;

public class Bank_Testing {

    public static void main(String[] args) {
	  Cashier cashier = new Cashier("Ramon Lorente","ramon@gmail.com","956-333-3333","6854");
      Manager manager = new Manager("Michael Lorente", "michael@gmail.com", "955-555-5555","1330");
        System.out.println(cashier.phoneNumber);
        cashier.signIn();
        manager.signIn();
    }
}
