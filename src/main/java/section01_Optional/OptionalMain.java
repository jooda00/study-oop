package section01_Optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();
        String string = mapRepository.getValue("NOT_EXIST_KEY");
        Optional<String> optional = mapRepository.getOptionalValue("NOT_EXIST_KEY");
        System.out.println("string = " + string);
        // Optional 사용 안하고 null 체크
        if(string != null) {
            System.out.println(string.toUpperCase());
        }

        // Optional 사용하고 null 체크1
        optional.ifPresentOrElse(
                str -> System.out.println(str.toUpperCase()), // Optional이 empty가 아닐 때
                () -> {
                    throw new RuntimeException("키가 존재하지 않습니다.");
                }
        );

        // Optional 사용하고 null 체크2
        String string1 = mapRepository.getOptionalValue("NOT_EXIST_KEY").orElseThrow(
                () -> {throw new RuntimeException("키가 존재하지 않습니다.");}
        );
        System.out.println(string1.toUpperCase());

        // Optional 직접 생성
        String string2 = Optional.ofNullable(mapRepository.getValue("NOT_EXIST_KEY")) // 그냥 string 반환 --> ofNullable()로 감싸주자
                .orElseThrow(RuntimeException::new); // 메소드 참조
        System.out.println(string2.toUpperCase());


    }
}