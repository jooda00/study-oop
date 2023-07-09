package study.lambda;

@FunctionalInterface
interface Print {
    // 추상 메서드
    void printMethod(int a, int b);
}

class Test{
    public void testMethod(Print print) {
        print.printMethod(1, 2);
        System.out.println("실행");
    }
}

public class LambdaPracMain {
    public static void main(String[] args) {
        Test noLambda = new Test();
        noLambda.testMethod(new Print() {
            @Override
            public void printMethod(int a, int b) {
                System.out.println(a + b);
                System.out.println(a * b);
            }
        });

        Test lambda = new Test();
        lambda.testMethod((a, b) -> {
            System.out.println(a + b);
            System.out.println(a * b);
        }); // --> 좀 더 간결하다.
    }
}