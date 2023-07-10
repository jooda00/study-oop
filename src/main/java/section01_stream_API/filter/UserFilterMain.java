package section01_stream_API.filter;

import java.util.ArrayList;
import java.util.List;

public class UserFilterMain {
    public static void main(String[] args) {
        String inputId = "programmers_user1";

        List<User> list = new ArrayList<>();

        list.add(new User("programmers_user1", "joo"));
        list.add(new User("programmers_user2", "J"));
        list.add(new User("programmers_user3", "GIO"));

        // idToFind가 사용 가능한 아이디인지 찾는 로직
        list.stream().filter(user -> user.sameId(inputId))
                .findAny()
                .ifPresentOrElse(
                        user -> {
                            throw new RuntimeException(inputId + " 이미 존재하는 아이디입니다.");
                            }, () ->{
                            System.out.println(inputId + " 사용 가능한 아이디입니다.");
                        });
    }
}
