package com.design.command;

/**
 * Created by lssemail on 2018/1/19.
 */
public class DoorOnCommand implements Command {

    private Door door;

    public DoorOnCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.on();
    }
}
