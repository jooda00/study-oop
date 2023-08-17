package section01_Object_class.toString;

public class ToStringMain {
    public static void main(String[] args) {
        SomeObject someObject1 = new SomeObject(1, "wow");
        SomeObject someObject2 = new SomeObject(100, "amaze");

        System.out.println(someObject1.toString());
        System.out.println(someObject2);
    }
}