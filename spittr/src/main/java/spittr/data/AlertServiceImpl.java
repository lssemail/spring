package spittr.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
import spittr.model.Spittle;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by lssemail on 2018/1/6.
 */
@Service
public class AlertServiceImpl implements AlertService{

    private JmsOperations jmsOperations;

    @Autowired
    public AlertServiceImpl(JmsOperations jmsOperations){

        this.jmsOperations = jmsOperations;
    }

    @Override
    public void sendSpittleAlert(final Spittle spittle) {

        //method1
        jmsOperations.send("spittle.alert.quene", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(spittle);
            }
        });

        //method2
        jmsOperations.convertAndSend(spittle);
    }
}
