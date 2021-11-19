package fish.payara.jakarta.ee9.start;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCustomerCheck implements ConstraintValidator<ValidCustomer, Customer> {

    @Override
    public void initialize(ValidCustomer constraintAnnotation) {
        //
    }

    @Override
    public boolean isValid(Customer value, ConstraintValidatorContext context) {
        return value.getTaxId().startsWith(value.getCountryCode());
    }
}
