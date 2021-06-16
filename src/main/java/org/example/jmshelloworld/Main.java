package org.example.jmshelloworld;

public class Main {

    public static void main(String[] args) throws Exception {
        final MessageSender  sender = new MessageSender();

        final MessageReceiver receiver = new MessageReceiver();
        receiver.startListener();

        for (int i = 0; i < 5; i++) {
            String message = "Hello World! " + i;
            sender.sendMessage(message);
            Thread.sleep(300);
        }

        sender.destroy();
        receiver.destroy();
    }

}
