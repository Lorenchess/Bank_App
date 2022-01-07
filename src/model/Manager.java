package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Manager extends Employee{


    public Manager(String fullName, String email, String phoneNumber, String id) {
        super(fullName, email, phoneNumber, id);
    }

    Set<RedIds> redIds = new HashSet<>(Arrays.asList(RedIds.JUAN, RedIds.PATRIC, RedIds.ROBERT));

    public void hireEmployee (Employee employee) {
        verifyEmployeeId(employee);
        //System.out.println("Congrats, I am hiring you now...");
    }

    private void verifyEmployeeId (Employee employee) {
        for (RedIds redId : redIds) {
            if (employee.getId().equals(redId.toString())) {
                System.out.println("I am sorry, your records are not clean.");
            } else {
                System.out.println("ID verification passed!");
            }
        }


    }


    public void checkBankHours (int hour, String day) {
        WorkDays workDay = null;
       if (day.contains(workDay.name())) {
           if (hour >= 8 && hour <= 18) {
               System.out.println("The Bank hours are from Monday to Friday from 8 A.M to 6 P.M. The Bank is currently Open");
           } else {
               System.out.println("The Bank hours are from Monday to Friday from 8 A.M to 6 P.M. The Bank is currently closed");
           }
       } else {
           System.out.println("Today is " + day + ". The Bank works from Monday through Friday");
       }

    }

    public void openBank () {
        System.out.println("Opening the Bank now...");
    }

    public void closeBank () {
        System.out.println("Closing the Bank now...");
    }

    public void approveCustomerLoans (Employee employee) {
        verifyEmployeeId(employee);
    }

}
