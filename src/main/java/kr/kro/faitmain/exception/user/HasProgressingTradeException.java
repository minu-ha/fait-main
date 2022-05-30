package kr.kro.faitmain.exception.user;

public class HasProgressingTradeException extends RuntimeException {

    public HasProgressingTradeException(String message) {
        super(message);
    }
}
