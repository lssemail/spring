package com.multhread.racecondition;

/**
 * Created by lssemail on 2018/1/25.
 */
public class EnergyTransferTask implements Runnable {

    private EnergySystem energySystem;

    private int fromBox;

    private double amount;

    private int delay = 10;

    public EnergyTransferTask(EnergySystem energySystem, int from, double amount){

        this.energySystem = energySystem;
        this.fromBox = from;
        this.amount = amount;
    }

    @Override
    public void run() {

        while (true){
            int toBox = (int) (energySystem.getBoxAmount() * Math.random());
            double am = amount * Math.random();
            energySystem.transfer(fromBox, toBox, am);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
