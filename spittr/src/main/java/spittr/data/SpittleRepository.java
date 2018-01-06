package spittr.data;

import spittr.model.Spittle;

import java.util.List;

/**
 * Created by lssemail on 2018/1/5.
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);

    void save(Spittle spittle);

    Spittle findOne(Long id);

    List<Spittle> findAll();
}
