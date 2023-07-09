package study.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class JavaFunction {
    // java에서 제공하는 FunctionalInterface function(람다식)
    public static void main(String[] args) {
        IntFunction intFunction = (a) -> a + 100;
        System.out.println(intFunction.apply(10));

        // 동일한 타입의 두 값을 받아서 연산 처리
        BinaryOperator binaryOperator = (a, b) -> a + " " + b;
        System.out.println(binaryOperator.apply("hi", "hello"));

        BiFunction<String , String , Boolean> biFunction = (a, b) -> a.equals(b);
        System.out.println(biFunction.apply("wow", "woww"));
     }
}