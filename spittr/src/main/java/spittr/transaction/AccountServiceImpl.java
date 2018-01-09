package spittr.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by lssemail on 2018/1/9.
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(String out, String in, Double money) {

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {

                accountDao.outMoney(out, money);
                accountDao.inMoney(in, money);

            }
        });
    }

    @Override
    public void transferNoTransaction(String out, String in, Double money) {

        accountDao.outMoney(out, money);
        int i = 1 / 0;
        accountDao.inMoney(in, money);
    }
}
