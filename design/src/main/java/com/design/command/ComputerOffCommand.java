package com.design.command;

/**
 * Created by lssemail on 2018/1/19.
 */
public class ComputerOffCommand implements Command {

    private Computer computer;

    public ComputerOffCommand(Computer computer){
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
