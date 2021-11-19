package fish.payara.jakarta.ee9.start;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ValidCustomerCheck.class })
public @interface ValidCustomer {

    String message() default "Customer is not valid";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

    // We can have additional members to configure the check.
}
