# JMS Hello World Example
We use Apache ActiveMQ as the provider implementation of JMS 
and point-to-point messaging model.

### Tools and Technologies Used
* Java 11
* Maven
* ActiveMQ

### To run ActiveMQ in Docker
```
# Pull the image from the docker index.
docker pull webcenter/activemq:5.14.3
# Launch the image
docker run --name activemq -it --rm -p 8161:8161 -p 61616:61616 -p 61613:61613 webcenter/activemq:5.14.3
```

### To open the web-console
The account admin is "admin" and password is "admin".<br>
[ActiveMQ web-console](http://localhost:8161/admin/)

### Useful links
* [ActiveMQ in Docker](https://hub.docker.com/r/webcenter/activemq/)
* [JMS Hello World Example](https://www.logicbig.com/tutorials/java-ee-tutorial/jms/jms-helloworld.html)
