package model;

import java.util.Random;
import java.util.regex.Pattern;

public class Employee implements SignIn_Out{
    private String fullName;
    private String email;
    private String phoneNumber;
    private int id;

    /* Fields to generate a random ID with 4 digits */
    private int max = 100;
    private Random randomNumber = new Random();
    private int randomId = randomNumber.nextInt(max) + 1000;

    private String emailRegex = "^(.+)@(.+).com$";
    private Pattern patternEmail = Pattern.compile(emailRegex);

    public Employee(String fullName, String email, String phoneNumber, int randomId) {
        if (!patternEmail.matcher(email).matches()) {
            throw new IllegalArgumentException("Illegal email address. Please type your email following the pattern :" +
                    " name@domain.com");
        }
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = randomId;
    }

    @Override
    public void signIn() {
        System.out.println("Employee is signing in...");
    }

    @Override
    public void signOut() {
        System.out.println("Employee is signing out...");
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }
}
