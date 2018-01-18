package com.design.observer;

/**
 * Created by lssemail on 2018/1/18.
 */
public interface Observerable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
