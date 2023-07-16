package com.exam.examspring.Exceptions;

public class ItIsAbsentException extends RuntimeException {
    public ItIsAbsentException() {
    }

    public ItIsAbsentException(String message) {
        super(message);
    }

    public ItIsAbsentException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItIsAbsentException(Throwable cause) {
        super(cause);
    }

    public ItIsAbsentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
