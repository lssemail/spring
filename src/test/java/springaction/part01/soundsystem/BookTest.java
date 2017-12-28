package springaction.part01.soundsystem;

import com.springaction.part01.soundsystem.Book;
import com.springaction.part01.soundsystem.BookConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lssemail on 2017/12/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BookConfig.class)
public class BookTest {

    @Autowired
    private Book book;

    @Test
    public void cdShouldNotBeNull(){

        System.out.println(book.getName());
        System.out.println(book.getPrice());
    }
}
