package org.instrong.exceptions;

import java.io.IOException;

public class InvalidRiotIdentificationException extends IOException {

    private final String errorMessage;

    public InvalidRiotIdentificationException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
