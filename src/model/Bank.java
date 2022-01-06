package model;

public class Bank {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private double money;
    //private int numberOfEmployees;
    private Employee employee;
    private Manager manager;
    private SalesRepresentative salesRepresentative;
    private Cashier cashier;
    private Customer customer;

    public Bank (String name, String email, String phoneNumber, String address, double money, Employee employee,
                 Manager manager, SalesRepresentative salesRepresentative, Cashier cashier, Customer customer) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.money = money;
        this.employee = employee;
        this.manager = manager;
        this.salesRepresentative = salesRepresentative;
        this.cashier = cashier;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getMoney() {
        return money;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Manager getManager() {
        return manager;
    }

    public SalesRepresentative getSalesRepresentative() {
        return salesRepresentative;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void openBank () {
        System.out.println("Opening the bank for customers");
    }

    public void closingBank () {
        System.out.println("Closing the bank for customers");
    }
}
