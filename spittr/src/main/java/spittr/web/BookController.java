package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.model.Book;
import spittr.model.validator.BookValidator;

import javax.validation.Valid;

/**
 * Created by lssemail on 2018/1/5.
 */
@Controller
@RequestMapping("/spittle")
public class BookController {

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String showRegistrationForm(){

        return "book";
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String book(@Valid Book book, BindingResult result){

        if(result.hasErrors()){
            StringBuffer sb = new StringBuffer();
            for(ObjectError objectError : result.getAllErrors()){
                sb.append(((FieldError)objectError).getField() +" : ").append(objectError.getDefaultMessage());
            }
            System.out.println(sb);
        }
        System.out.println("book");
        return "profile";
    }


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        webDataBinder.addValidators(new BookValidator());
    }

}
