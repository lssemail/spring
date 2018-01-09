package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lssemail on 2018/1/8.
 */
@Controller
public class MyFilterController {

    @RequestMapping("/myFilter/{page}")
    public String myFilter(@PathVariable String page){

        System.out.println(page);
        return "myFilter";
    }

//    @RequestMapping("/myServlet/{page}")
//    public String myServlet(@PathVariable String page){
//
//        System.out.println(page);
//        return "myServlet";
//    }
}
