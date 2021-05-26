package com.ru.org.name.domain;

import com.ru.org.name.domain.interfaces.InternalValidationExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class InternalValidationExceptionsImpl extends InternalValidationExceptions {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,reason = "Error 500")
    public void handleUncheckedExceptions(RuntimeException exception) {

    }

    @ExceptionHandler(InternalValidationExceptions.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,reason = "Error 400")
    public void handleValidationExceptions(InternalValidationExceptions e) {

    }

}
