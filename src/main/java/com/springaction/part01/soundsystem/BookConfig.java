package com.springaction.part01.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lssemail on 2017/12/9.
 */
@Configuration
public class BookConfig {

    @Bean
    public Book book(){
        Book book = new Book();
            book.setName("book");
            book.setPrice(123.4D);
        return book;
    }
}
