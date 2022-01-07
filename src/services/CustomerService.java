package services;

public class CustomerService {
    private static volatile CustomerService customerService;

    private CustomerService () {}

    public static CustomerService getInstance() {
        if (customerService == null) {
            synchronized (CustomerService.class) {
                if (customerService == null) {
                    customerService = new CustomerService();
                }
            }
        }
        return customerService;
    }





}
