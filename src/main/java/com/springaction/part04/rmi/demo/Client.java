package com.springaction.part04.rmi.demo;

import java.rmi.Naming;
import java.util.List;

/**
 * Created by lssemail on 2017/12/28.
 */
public class Client {

    public static void main(String[] args) {
        try {
            PersonService personService = (PersonService)Naming.lookup("rmi://127.0.0.1:6600/PersonService");
            List<PersonEntity> personList=personService.GetList();
            for(PersonEntity person:personList){
                System.out.println("ID:"+person.getId()+" Age:"+person.getAge()+" Name:"+person.getName());
            }
        }catch (Exception e){

        }


    }
}
