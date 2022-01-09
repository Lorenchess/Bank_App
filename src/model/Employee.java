package model;

import java.util.*;
import java.util.regex.Pattern;

/* Abstract & Superclass */

public abstract class Employee implements SignIn_Out{
    protected String fullName;
    protected String email;
    protected String phoneNumber;
    protected String id;

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

    /* Abstract Methods */
    @Override
    public abstract void signIn();

    @Override
    public abstract void signOut();



}
