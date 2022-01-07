package services;

import model.Employee;
import model.Manager;

public class BankService {
    private static volatile BankService bankService;

    private BankService () {}

    public static BankService getInstance() {
        if (bankService == null) {
            synchronized (BankService.class) {
                if (bankService == null) {
                    bankService = new BankService();
                }
            }
        }
        return bankService;
    }


   public void hiringEmployee (Manager manager, Employee employee) {
        manager.hireEmployee(employee);
   }






}
