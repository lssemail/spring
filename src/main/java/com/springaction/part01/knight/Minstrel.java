package com.springaction.part01.knight;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream printStream;

    public Minstrel (PrintStream printStream){

        this.printStream = printStream;
    }

    public void singBeforeQuest(){

        printStream.println("single before ");
    }

    public void singAfterQuest(){
        printStream.println("single after");
    }
}
