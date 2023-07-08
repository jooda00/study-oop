package section01_02.with_interface;

public class WithInterfaceMain {
    public static void main(String[] args) {
        MessageSender messageSender = new RealMessageSender();
        Client client = new Client(messageSender);
        client.someMethod();
    }
}
