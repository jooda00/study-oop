package section01_02.with_interface;

public class Client {
    /* 전형적 의존-주입 패턴 
    * Client코드는 어떤 MessageSender인지 알 필요 없음
    * */
    private MessageSender messageSender;

    Client(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void someMethod() {
        messageSender.send();
    }

}
