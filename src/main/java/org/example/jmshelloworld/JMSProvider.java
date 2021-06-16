package org.example.jmshelloworld;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.ConnectionFactory;

public class JMSProvider {

    public static ConnectionFactory getConnectionFactory() {
        return new ActiveMQConnectionFactory("tcp://0.0.0.0:61616");
    }

}
