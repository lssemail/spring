package spittr.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spittr.model.Spittle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lssemail on 2018/1/6.
 */
@Repository
public class JdbcSpittleRepository  implements SpittleRepository{

    private JdbcOperations jdbcOperations;

    @Override
    public List<Spittle> findAll() {

        return null;
    }

    @Autowired
    public JdbcSpittleRepository(JdbcOperations jdbcOperations){
        this.jdbcOperations = jdbcOperations;
    }


    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    @Override
    public void save(Spittle spittle) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("insert into spittle ")
                    .append(" (message,")
                    .append(" time,")
                    .append(" latitude,")
                    .append(" longitude)")
                    .append(" values")
                    .append(" (?, ").append(" ?,").append(" ?,").append(" ?)");
        int intAddRows = jdbcOperations.update(stringBuffer.toString(), spittle.getMessage(), spittle.getTime(), spittle.getLatitude(), spittle.getLongitude());
        System.out.println(intAddRows);
    }

    @Override
    public Spittle findOne(Long id) {

        String sql = "select * from spittle where id = ?";
        return jdbcOperations.queryForObject(sql, new SpitterRowMapper(), id);
    }

//    public Spittle findOne1(Long id){
//
//        String sql = "select * from spittle where id = ?";
//        return jdbcOperations.queryForObject(sql, this::mapSpittle, id);
//    }


    private static final class SpitterRowMapper implements RowMapper<Spittle>{

        @Override
        public Spittle mapRow(ResultSet rs, int i) throws SQLException {
            return new Spittle(
                    rs.getString("message"), rs.getDate("time"), rs.getDouble("longitude"), rs.getDouble("latitude")
            );
        }
    }

    private Spittle mapSpittle(ResultSet rs, int i) throws Exception{

        return new Spittle(
                rs.getString("message"), rs.getDate("time"), rs.getDouble("longitude"), rs.getDouble("latitude")
        );

    }
}
