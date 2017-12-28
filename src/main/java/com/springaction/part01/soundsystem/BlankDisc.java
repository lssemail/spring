package com.springaction.part01.soundsystem;

import java.util.List;

/**
 * Created by lssemail on 2017/12/9.
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("hello world");
        System.out.println(this.title);
        System.out.println(this.artist);
        for(String str : tracks){
            System.out.println(str);
        }
    }

    @Override
    public void play(int num) {
        System.out.println(num);
    }
}
