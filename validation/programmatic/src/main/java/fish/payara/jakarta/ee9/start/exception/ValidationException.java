package fish.payara.jakarta.ee9.start.exception;

import java.util.List;

public class ValidationException extends BusinessException {


    private final List<String> violations;

    public ValidationException(List<String> violations) {

        this.violations = violations;
    }

    public List<String> getMessages() {
        return violations;
    }
}
