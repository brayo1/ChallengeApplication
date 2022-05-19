package com.hackerrank.restcontrolleradvice.exception;

import com.hackerrank.restcontrolleradvice.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {

  //TODO:: implement handler methods for FizzException, BuzzException and FizzBuzzException

    @ExceptionHandler(BuzzException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public @ResponseBody
    GlobalError handleBuzzException(final BuzzException exception) {

        GlobalError error = new GlobalError();
        error.setMessage(exception.getMessage());
        error.setErrorReason(exception.getErrorReason());

        return error;
    }

    @ExceptionHandler(FizzException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody
    GlobalError handleFizzException(final FizzException exception) {

        GlobalError error = new GlobalError();
        error.setMessage(exception.getMessage());
        error.setErrorReason(exception.getErrorReason());

        return error;
    }

    //FizzBuzzException
    @ExceptionHandler(FizzBuzzException.class)
    @ResponseStatus(value = HttpStatus.INSUFFICIENT_STORAGE)
    public @ResponseBody
    GlobalError handleFizzBuzzException(final FizzBuzzException exception) {

        GlobalError error = new GlobalError();
        error.setMessage(exception.getMessage());
        error.setErrorReason(exception.getErrorReason());

        return error;
    }
}
