package section01_stream_API.filter;

public class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean sameId(String inputId){
        return this.id.equals(inputId);
    }
}
