package spittr.data;

import spittr.model.Spittle;

/**
 * Created by lssemail on 2018/1/6.
 */
public interface AlertService {

    void sendSpittleAlert(Spittle spittle);
}
