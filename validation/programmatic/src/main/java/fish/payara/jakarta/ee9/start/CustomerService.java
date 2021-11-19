package fish.payara.jakarta.ee9.start;

import fish.payara.jakarta.ee9.start.exception.ValidationException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ValidatorFactory;

import java.util.Set;
import java.util.stream.Collectors;

@ApplicationScoped
public class CustomerService {

    @Inject
    private ValidatorFactory validatorFactory;

    public void saveCustomer(Customer customer) {
        Set<ConstraintViolation<Customer>> violations = validatorFactory.getValidator().validate(customer);
        if (!violations.isEmpty()){
            throw new ValidationException(violations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList()));
        }

    }
}
