package spittr.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * Created by lssemail on 2018/1/6.
 */
@Configuration
public class DataSourceConfig {

//    @Profile("development")
//    @Bean
//    public DataSource embeddedDataSource(){
//
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("classpath:schema.sql")
//                .addScript("classpath:test-data.sql")
//                .build();
//    }

    @Bean
    public DataSource qaData(){

        BasicDataSource ds = new BasicDataSource();
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setUrl("jdbc:mysql://127.0.0.1:3306/spittr?useUnicode=true&characterEncoding=utf-8");
            ds.setUsername("root");
            ds.setPassword("");
            ds.setInitialSize(5);
            ds.setMaxActive(10);

        return ds;
    }

//    @Profile("production")
//    @Bean
//    public DataSource Data(){
//        JndiObjectFactoryBean jndiObjectFactoryBean =
//                new JndiObjectFactoryBean();
//        jndiObjectFactoryBean.setJndiName("jdbc/SpittrDS");
//        jndiObjectFactoryBean.setResourceRef(Boolean.TRUE);
//        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
//        return (DataSource) jndiObjectFactoryBean.getObject();
//    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){

        return new JdbcTemplate(dataSource);
    }
}
