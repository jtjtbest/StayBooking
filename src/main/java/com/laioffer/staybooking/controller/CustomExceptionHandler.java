package com.laioffer.staybooking.controller;

import com.laioffer.staybooking.exception.GCSUploadException;
import com.laioffer.staybooking.exception.GeoCodingException;
import com.laioffer.staybooking.exception.InvalidReservationDateException;
import com.laioffer.staybooking.exception.InvalidSearchDateException;
import com.laioffer.staybooking.exception.InvalidStayAddressException;
import com.laioffer.staybooking.exception.ReservationCollisionException;
import com.laioffer.staybooking.exception.ReservationNotFoundException;
import com.laioffer.staybooking.exception.StayDeleteException;
import com.laioffer.staybooking.exception.StayNotExistException;
import com.laioffer.staybooking.exception.UserAlreadyExistException;
import com.laioffer.staybooking.exception.UserNotExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
//ControllerAdvice to make Spring use CustomExceptionHandler
// when there’s any exceptions in the Controller code.
public class CustomExceptionHandler {
    @ExceptionHandler(UserAlreadyExistException.class)
    public final ResponseEntity<String> handleUserAlreadyExistExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserNotExistException.class)
    public final ResponseEntity<String> handleUserNotExistExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(StayNotExistException.class)
    public final ResponseEntity<String> handleStayNotExistExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(GCSUploadException.class)
    public final ResponseEntity<String> handleGCSUploadExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(InvalidSearchDateException.class)
    public final ResponseEntity<String> handleInvalidSearchDateExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(GeoCodingException.class)
    public final ResponseEntity<String> handleGeoCodingExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(InvalidStayAddressException.class)
    public final ResponseEntity<String> handleInvalidStayAddressExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ReservationCollisionException.class)
    public final ResponseEntity<String> handleReservationCollisionExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(InvalidReservationDateException.class)
    public final ResponseEntity<String> handleInvalidReservationDateExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ReservationNotFoundException.class)
    public final ResponseEntity<String> handleReservationNotFoundExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StayDeleteException.class)
    public final ResponseEntity<String> handleStayDeleteExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

}