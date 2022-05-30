package kr.kro.faitmain.exception.order;

public class LowPointException extends RuntimeException {

    public LowPointException(String message) {
        super(message);
    }
}