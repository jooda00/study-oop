package section01_stream_API.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        Integer findNum = integerList.stream().filter(
                integer -> {
                    System.out.println(integer);

                    if(integer.equals(40))
                        return true;
                    return false;
                }
        ).findAny().get();

        Integer num = integerList.stream().filter(
                integer -> integer.equals(40)
        ).findAny().get();

        System.out.println("findNum = " + findNum);
        System.out.println(num);
    }
}
