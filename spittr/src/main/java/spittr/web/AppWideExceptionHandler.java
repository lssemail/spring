package spittr.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import spittr.exceptions.SpittleNotFoundException;

/**
 * Created by lssemail on 2018/1/5.
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(SpittleNotFoundException.class)
    public String spittleNotFoundException(){

        return "error";
    }
}
