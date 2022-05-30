package kr.kro.faitmain.exception.user;

public class DuplicateCartItemException extends RuntimeException {

    public DuplicateCartItemException(String message) {
        super(message);
    }
}