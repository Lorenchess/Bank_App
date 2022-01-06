package model;

import java.util.regex.Pattern;

public class Manager {
    private String fullName;
    private String email;
    private int id;
    private String phoneNumber;

    private String emailRegex = "^(.+)@(.+).com$";
    private Pattern patternEmail = Pattern.compile(emailRegex);

    public Manager(String fullName, String email, int id, String phoneNumber) {
        if (!patternEmail.matcher(email).matches()) {
            throw new IllegalArgumentException("Illegal email address. Please type your email following the pattern :" +
                    " name@domain.com");
        }
        this.fullName = fullName;
        this.email = email;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void hireEmployee () {

    }

    public void verifyIdOfEmployee () {

    }

    public void checkEmployeeCreditScore () {

    }

    public void openBank () {

    }

    public void closeBank () {

    }

    public void approveCustomerLoans () {

    }
}
