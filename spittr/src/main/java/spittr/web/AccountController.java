package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.transaction.AccountService;

/**
 * Created by lssemail on 2018/1/9.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/transfer", method = RequestMethod.GET)
    public String account1(){

        accountService.transfer("1234", "5678", 100D);
        return "transfer";
    }

    @RequestMapping(value = "/no", method = RequestMethod.GET)
    public String account2(){

        accountService.transferNoTransaction("1234", "5678", 100D);
        return "transfer";
    }

}
