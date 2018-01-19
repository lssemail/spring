package com.design.command;

/**
 * Created by lssemail on 2018/1/19.
 */
public class ComputerOnCommand implements Command {

    private Computer computer;

    public ComputerOnCommand(Computer computer){
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}
