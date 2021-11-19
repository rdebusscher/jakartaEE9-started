package fish.payara.jakarta.ee9.start.exception;

public class BusinessException extends RuntimeException {

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }
}
