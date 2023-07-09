package section01_Optional;

public class NullMain {
    public  String getStr() {
        return "hi";
    }

    public static void main(String[] args) {
        String str = getNull();
        NullMain m = null;
        System.out.println(m.getStr().toUpperCase());
        System.out.println(str);
        System.out.println(str.toUpperCase());

    }
    private static String getNull() {
        return null;
    }
}