package com.exam.examspring.Exceptions;

public class ItAlreadyExistsException extends RuntimeException {
    public ItAlreadyExistsException() {
    }

    public ItAlreadyExistsException(String message) {
        super(message);
    }

    public ItAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public ItAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
