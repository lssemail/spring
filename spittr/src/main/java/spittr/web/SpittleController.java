package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import spittr.data.JdbcSpittleRepository;
import spittr.data.SpittleRepository;
import spittr.exceptions.SpittleNotFoundException;
import spittr.model.Spitter;
import spittr.model.Spittle;
import sun.security.provider.ConfigFile;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by lssemail on 2018/1/5.
 */
@Controller
@RequestMapping("/spittle")
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(JdbcSpittleRepository spittleRepository){

        this.spittleRepository = spittleRepository;
    }
//
//
//    @RequestMapping(value = "/spittles", method = RequestMethod.GET)
//    public String spittles(Model model){
//
//        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//        return "spittles";
//    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(){

        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid Spitter spitter, BindingResult result, Model model){

        if(result.hasErrors()){
            StringBuffer sb = new StringBuffer();
            for(ObjectError objectError : result.getAllErrors()){
                sb.append(((FieldError)objectError).getField() +" : ").append(objectError.getDefaultMessage());
            }
            System.out.println(sb);
            return "registerForm";
        }

        System.out.println(spitter.toString());
        model.addAttribute(spitter);
        return "profile";
    }


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

        System.out.println("hello world");
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public void testException(){

        throw new SpittleNotFoundException();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public void save(){
        Spittle spittle = new Spittle("测试数据保存", new Date() ,2D, 3D);
        spittleRepository.save(spittle);
    }

    @RequestMapping("/findOne/{id}")
    public void getOne(@PathVariable Long id){

        Spittle spittle = spittleRepository.findOne(id);
        System.out.println(spittle.toString());
    }

//    @ExceptionHandler(SpittleNotFoundException.class)
//    public String handleNotFoundException(){
//
//        return "error";
//    }

}
