package kr.kro.faitmain.exception.user;

public class AuthenticationNumberMismatchException extends RuntimeException {
    public AuthenticationNumberMismatchException(String message) {
        super(message);
    }
}
