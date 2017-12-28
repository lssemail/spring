package com.socket;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lssemail on 2017/12/26.
 */
public class Test {

    public static void main(String[] args) {

        macthIP("127.0.0.1");
    }

    public static void macthIP(String ip){
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("127.0.0.1", "AA");
        dataMap.put("127.0.0.2", "BB");
        dataMap.put("127.0.0.3", "CC");
        dataMap.put("127.0.0.4", "DD");

        dataMap.keySet().forEach(item -> {
            if(item.equals(ip)){
                System.out.println(ip);
            }
        });

    }
}
