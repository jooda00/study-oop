package section01_stream_API.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        integerList.stream().forEach(
                (integer) -> {
                    System.out.println(integer);
                }
        );

        integerList.stream().forEach(
                integer -> {
                    System.out.println(integer);

                    if (integer.equals(40)) {
                        throw new RuntimeException();
                    }
                });
    }
}
