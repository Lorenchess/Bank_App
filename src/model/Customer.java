package model;

import java.util.Objects;
import java.util.regex.Pattern;

public class Customer {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
    private String id;
    private int creditScore;
    private int creditCardNumber;
    private double moneyInBank;
    private boolean hasLoan;

    private String emailRegex = "^(.+)@(.+).com$";
    private Pattern patternEmail = Pattern.compile(emailRegex);

    public Customer(String fullName, String email, String phoneNumber, String address, String id,
                    int creditScore, int creditCardNumber, double moneyInBank) {
        if (!patternEmail.matcher(email).matches()) {
            throw new IllegalArgumentException("Illegal email address. Please type your email following the pattern :" +
        " name@domain.com");
        }
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id = id;
        this.creditScore = creditScore;
        this.creditCardNumber = creditCardNumber;
        this.moneyInBank = moneyInBank;
        this.hasLoan = false;
    }

    public String getName() {
        return fullName;
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

    public String getId() {
        return id;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getMoneyInBank () {
        return moneyInBank;
    }

    public boolean isHasLoan() {
        return hasLoan;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getCreditScore() == customer.getCreditScore() && creditCardNumber == customer.creditCardNumber && Double.compare(customer.getMoneyInBank(), getMoneyInBank()) == 0 && isHasLoan() == customer.isHasLoan() && fullName.equals(customer.fullName) && getEmail().equals(customer.getEmail()) && getPhoneNumber().equals(customer.getPhoneNumber()) && getAddress().equals(customer.getAddress()) && getId().equals(customer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, getEmail(), getPhoneNumber(), getAddress(), getId(), getCreditScore(), creditCardNumber, getMoneyInBank(), isHasLoan());
    }
}
