package ro.zah.employeemanagement.exception.domain;

public class EmailExistException extends Exception {
    public EmailExistException(String message) {
        super(message);
    }
}
