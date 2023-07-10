package section01_stream_API.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        List<Integer> x10IntegerList = integerList.stream()
                .map(integer -> integer * 10)
                .collect(Collectors.toList());

        x10IntegerList.stream().forEach(
                integer -> {
                    System.out.println(integer);
                }
        );
    }
}
