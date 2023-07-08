package section01_02.with_interface;

public class FakeMessageSender implements MessageSender{
    public void send() {
        System.out.println("FakeMessageSender");
    }
}
