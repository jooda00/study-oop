package section01_클래스와상속.overloading;

public class AddCalculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

//    return 타입만 다르게 오버로딩은 불가능
//    public long add(int num1, int num2) {
//        return num1 + num2;
//    }

    public long add(long num1, long num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        AddCalculator calculator = new AddCalculator();
        int intResult = calculator.add(1,2);
        long longResult = calculator.add(1L,2L);
        double doubleResult = calculator.add(10.0, 20.0);
        System.out.println(intResult);
        System.out.println(longResult);
        System.out.println(doubleResult);
    }
}