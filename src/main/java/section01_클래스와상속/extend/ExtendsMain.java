package section01_클래스와상속.extend;

public class ExtendsMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentType = new Child(); // 다형성 --> 부모 타입으로 자식 인스턴스 생성 및 사용
        Child child = new Child();
        
        parent.someMethod();
        child.anotherMethod();
//        parentType.anotherMethod(); // Child 인스턴스이지만, 타입이 Parent이므로 호출 불가
        child.someMethod(); // 상속받은 메서드
        parentType.someMethod(); // 실제 child 인스턴스의 메서드가 실행됨(위와 동일)
    }
}
