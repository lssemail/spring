package com.springaction.part01.soundsystem;

/**
 * Created by lssemail on 2017/12/9.
 */
public interface CompactDisc {

    void play();

    default void play(int num){};
}
