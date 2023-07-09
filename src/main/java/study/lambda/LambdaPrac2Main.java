package study.lambda;

@FunctionalInterface
interface SmallNum {
    int getSmallNum(int a, int b);
}

public class LambdaPrac2Main {
    public static void main(String[] args) {
        SmallNum smallNum = (a, b) -> {
            if (a > b) { return b;}
            else return a;
        };
        System.out.println(smallNum.getSmallNum(3, 2));
    }
}
