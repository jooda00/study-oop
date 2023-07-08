package section01_클래스와상속.extend;

public class Child extends Parent {
    public void anotherMethod() {
        System.out.println("Child anotherMethod");

        this.parentProtectedInt = 0;
        this.parentPublicInt = 0;
//        this.parentPrivateInt = 0;    // 상속 되지 않았기 때문에 불가능!
    }

    // 어노테이션은 필수는 아니지만 실수 방지를 위해 해놓는 것이 좋다.
    @Override
    public void someMethod() {
        System.out.println("Child someMethod");
    }
}
