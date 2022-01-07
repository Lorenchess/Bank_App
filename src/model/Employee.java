package model;

import java.util.*;
import java.util.regex.Pattern;

public class Employee implements SignIn_Out{
    private String fullName;
    private String email;
    private String phoneNumber;
    private String id;

    private String emailRegex = "^(.+)@(.+).com$";
    private Pattern patternEmail = Pattern.compile(emailRegex);

    public Employee(String fullName, String email, String phoneNumber, String id) {
        if (!patternEmail.matcher(email).matches()) {
            throw new IllegalArgumentException("Illegal email address. Please type your email following the pattern :" +
                    " name@domain.com");
        }
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
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

    public String getId() {
        return id;
    }
}
