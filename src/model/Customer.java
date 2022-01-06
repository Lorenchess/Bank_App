package model;

import java.util.regex.Pattern;

public class Customer {
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private int id;
    private int creditScore;
    private int creditCardNumber;

    private String emailRegex = "^(.+)@(.+).com$";
    private Pattern patternEmail = Pattern.compile(emailRegex);

    public Customer(String name, String lastName, String email, String phoneNumber, String address, int id,
                    int creditScore, int creditCardNumber) {
        if (!patternEmail.matcher(email).matches()) {
            throw new IllegalArgumentException("Illegal email address. Please type your email following the pattern :" +
        " name@domain.com");
        }
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id = id;
        this.creditScore = creditScore;
        this.creditCardNumber = creditCardNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
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

    public int getId() {
        return id;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void requestRepresentative () {

    }

    public void visitCashier () {

    }

    public void requestCreateAccount () {

    }

    public void makeDeposit () {

    }

    public void makeWithdrawal () {

    }

    public void requestLoan (double amount) {

    }

    public void closeAccount () {

    }
}
