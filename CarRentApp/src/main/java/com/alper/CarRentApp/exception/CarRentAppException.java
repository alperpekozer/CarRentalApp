package com.alper.CarRentApp.exception;

import lombok.Getter;

@Getter
public class CarRentAppException extends RuntimeException{
    private final ErrorType errorType;
    public CarRentAppException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }
    public CarRentAppException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }

}
