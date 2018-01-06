package com.springaction.part04.rmi.demo;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by lssemail on 2017/12/28.
 */
public interface PersonService extends Remote {

    public List<PersonEntity> GetList() throws RemoteException;
}
