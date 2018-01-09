package spittr.transaction;

/**
 * Created by lssemail on 2018/1/9.
 */
public interface AccountService {

    void transfer(String out,String in,Double money);

    void transferNoTransaction(String out,String in,Double money);
}
