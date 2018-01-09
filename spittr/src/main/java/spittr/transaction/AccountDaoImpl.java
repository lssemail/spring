package spittr.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by lssemail on 2018/1/9.
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate template;

    @Autowired
    public AccountDaoImpl(JdbcTemplate template){

        this.template = template;
    }

    @Override
    public void outMoney(String out, Double money) {

        String sql = "UPDATE account set money = money-? WHERE name=?";
        this.template.update(sql, money, out);
    }

    @Override
    public void inMoney(String out, Double money) {
        String sql = "UPDATE account set money = money+? WHERE name=?";
        this.template.update(sql, money, out);
    }
}
