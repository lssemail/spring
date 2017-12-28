package com.springaction.part01.soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lssemail on 2017/12/28.
 */
@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* com.springaction.part01.soundsystem.CompactDisc.play(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
        System.out.println("count:\t" + getPlayCount(trackNumber));
    }

    public int getPlayCount(int trackNumber){

        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }

}
