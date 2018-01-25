package com.multhread.racecondition;

/**
 * Created by lssemail on 2018/1/25.
 */
public class EnergySystem {

    private final double[] energyBoxes;
    private Object objectLock = new Object();

    public EnergySystem(int n, double initialEnergy){
        energyBoxes = new double[n];
        for (int i=0; i< n; i++){
            energyBoxes[i] = initialEnergy;
        }
    }

    public void transfer(int from, int to, double amount){
//        if(energyBoxes[from] < amount){
//            return;
//        }
        synchronized (objectLock){
            //while循环，保证条件不满足时任务都会被条件阻挡，而不是竞争CPU资源
            while (energyBoxes[from] < amount){
                try {
                    //条件不满足放入 Wait Set
                    objectLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print(Thread.currentThread().getName());
            energyBoxes[from] -= amount;
            System.out.printf("从%d 转移 %10.2f单位能量到%d", from, amount, to);
            energyBoxes[to] +=amount;
            System.out.printf("能量总和：%10.2f%n", getTotalEnergies());

            //唤醒所有在objectLock上等待的线程;
            objectLock.notifyAll();
        }


    }

    public double getTotalEnergies(){
        double sum = 0;
        for (double d : energyBoxes){
            sum +=d;
        }
        return sum;
    }

    public int getBoxAmount(){

        return energyBoxes.length;
    }
}
