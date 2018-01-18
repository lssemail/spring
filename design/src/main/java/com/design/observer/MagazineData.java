package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lssemail on 2018/1/18.
 */
public class MagazineData implements Observerable {

    private List<Observer> observerList;
    private int edition;
    private float cost;

    public MagazineData(){
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {

        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        int i = observerList.indexOf(observer);
        if(i >=0){
            observerList.remove(i);
        }

    }

    @Override
    public void notifyObservers() {

        observerList.stream().forEach(item ->{
            item.update(edition, cost);
        });
    }

    public void setInfomation(int edition, float cost){

        this.edition = edition;
        this.cost = cost;

        notifyObservers();
    }
}
