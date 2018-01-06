package spittr.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

/**
 * Created by lssemail on 2018/1/6.
 */
@Configuration
public class JMSConfig {

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory(){
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        return factory;
    }

    @Bean
    public ActiveMQQueue activeMQQueue(){

        ActiveMQQueue activeMQQueue = new ActiveMQQueue("spitter.quene");
        return activeMQQueue;
    }

    @Bean
    public ActiveMQTopic activeMQTopic(){

        ActiveMQTopic topic = new ActiveMQTopic("spitter.topic");
        return topic;
    }

    @Bean
    public JmsTemplate jmsTemplate(){

        JmsTemplate template = new JmsTemplate(activeMQConnectionFactory());
        template.setDefaultDestinationName("spittle.alert.quene");
        return template;
    }
}
