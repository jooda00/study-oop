package section01_02.with_interface;

public class RealMessageSender implements MessageSender{
    public void send() {
        System.out.println("RealMessageSender");
    }
}
