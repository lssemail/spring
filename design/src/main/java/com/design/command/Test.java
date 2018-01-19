package com.design.command;

/**
 * Created by lssemail on 2018/1/19.
 */
public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        Computer computer = new Computer();
        Door door = new Door();

        ControlPanel panel = new ControlPanel();
        panel.setCommand(0, new LightOnCommand(light));
        panel.setCommand(1, new LightOffCommand(light));
        panel.setCommand(2, new ComputerOnCommand(computer));
        panel.setCommand(3, new ComputerOffCommand(computer));
        panel.setCommand(4, new DoorOnCommand(door));
        panel.setCommand(5, new DoorOffCommand(door));

        for(int i=0; i< 9; i++){
            panel.keyPressed(i);
        }

    }
}
