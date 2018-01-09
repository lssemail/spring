package spittr.transaction;

/**
 * Created by lssemail on 2018/1/9.
 */
public interface AccountDao {

    public void outMoney(String out, Double money);

    public void inMoney(String out, Double money);
}
