package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lssemail on 2018/1/5.
 */
@Controller
@RequestMapping("/spittr")
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){

        return "home";
    }
}
