package springaction.part01.myapp;


import com.springaction.part01.myapp.AbstractDataSource;
import com.springaction.part01.myapp.config.DataSourceConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataSourceConfig.class)
@ActiveProfiles("dev")
public class MyappTest {

    @Autowired
    private AbstractDataSource dataSource;

    public void test(){

        dataSource.print();

    }

}
