package com.springaction.part01.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by lssemail on 2017/12/9.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "If I Ware a Boy";
    private String artist = "Beyonce";

    @Override
    public void play() {
        System.out.println("Playing\t" + title + "by\t" + artist);
    }
}
