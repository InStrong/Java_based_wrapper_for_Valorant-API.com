package org.instrong.exceptions;

import java.io.IOException;

public class FetchException extends IOException {

    private final String errorMessage;

    public FetchException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}