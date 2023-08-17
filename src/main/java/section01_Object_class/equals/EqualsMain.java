package section01_Object_class.equals;

public class EqualsMain {
    public static void main(String[] args) {
        SomeObject someObject1 = new SomeObject(1, "equalsTest");
        SomeObject someObject2 = new SomeObject(1, "equalsTest");

        SomeObject anotherObject = new SomeObject(100, "wow");

        SomeObject someObject3 = someObject1;

        // 동일성 비교
        System.out.println(someObject1 == someObject2);
        // 동일성 비교
        System.out.println(someObject1 == someObject3);
        // 동등성 비교 --> equals() 메소드를 오버라이딩하지 않으면 동등하더라도 false가 나온다.
        System.out.println(someObject1.equals(someObject2));
        // 동등성 비교
        System.out.println(anotherObject.equals(someObject1));
    }
}
