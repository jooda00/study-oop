package section01_02.without_interface;

public class Client {
    public void someMethod() {
        // 메시지 보내기 전 실행되는 어떤 작업
        FakeMessageSender messageSender = new FakeMessageSender();
//        RealMessageSender messageSender = new RealMessageSender();
        messageSender.send();
    }
}