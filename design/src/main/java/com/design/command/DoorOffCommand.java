package com.design.command;

/**
 * Created by lssemail on 2018/1/19.
 */
public class DoorOffCommand implements Command {

    private Door door;

    public DoorOffCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.off();
    }
}
