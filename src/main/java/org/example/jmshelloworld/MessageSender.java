package org.example.jmshelloworld;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

public class MessageSender {

    private final MessageProducer producer;
    private final Session session;
    private final Connection connection;

    public MessageSender() throws JMSException {
        ConnectionFactory factory = JMSProvider.getConnectionFactory();
        this.connection = factory.createConnection();
        connection.start();

        this.session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue(QueueNames.HELLO_QUEUE);
        this.producer = session.createProducer(queue);
    }

    public void sendMessage(String message) throws JMSException {
        System.out.printf("Sending message: %s, Thread: %s%n",
                message,
                Thread.currentThread().getName());
        TextMessage textMessage = session.createTextMessage(message);
        producer.send(textMessage);
    }

    public void destroy() throws JMSException {
        connection.close();
    }
}
