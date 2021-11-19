package fish.payara.jakarta.ee9.start.jsf;

import fish.payara.jakarta.ee9.start.Customer;
import fish.payara.jakarta.ee9.start.CustomerService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@RequestScoped
@Named
public class CustomerEditBean {

    @Inject
    private CustomerService customerService;

    private Customer customer = new Customer();

    public Customer getCustomer() {
        return customer;
    }

    public void save() {
        customerService.saveCustomer(customer);
    }
}
