package section01_Object_class.hashcode;

import section01_Object_class.hashcode.SomeObject;

import java.util.HashSet;
import java.util.Set;

public class HashCodeMain {
    public static void main(String[] args) {
        // hash 비교하고 --> equals 비교한다.
        
        SomeObject someObject1 = new SomeObject(1, "hash");
        SomeObject someObject2 = new SomeObject(1, "hash");

        // Set --> 동일한 값 오직 하나만 저장
        Set<SomeObject> set = new HashSet<>();

        // hashCode() 오버라이딩하면 둘은 같은 해시코드 값 가짐
        System.out.println(someObject1.hashCode());
        System.out.println(someObject2.hashCode());

        set.add(someObject1);
        set.add(someObject2);

        // 같은 값이므로 하나만 set에 하나만 저장됨
        System.out.println(set.size());
    }
}
