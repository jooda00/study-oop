package section01_Optional;

import java.util.Optional;

public class AntiOptionalMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();
        Optional<String> string = mapRepository.getOptionalValue("NOT_EXIST_VALUE");

        // 기존 null 체크와 다를 게 없음. 이렇게 쓰지 말 것
        if(!string.isPresent()) {
            throw new RuntimeException("키를 찾지 못했습니다.");
        }
        else {
            System.out.println(string.get().toUpperCase());
        }
    }
}
