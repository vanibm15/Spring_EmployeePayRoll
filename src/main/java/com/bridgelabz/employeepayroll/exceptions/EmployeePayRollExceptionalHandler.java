package com.bridgelabz.employeepayroll.exceptions;

import com.bridgelabz.employeepayroll.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class EmployeePayRollExceptionalHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO>handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        List<ObjectError>errorList = exception.getBindingResult().getAllErrors();
        List<String> errMessage = errorList.stream().map(objErr->objErr.getDefaultMessage()).collect(Collectors.toList());
        ResponseDTO responseDTO= new ResponseDTO("Exception while processing REST Request", errMessage);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);

    }

    }



