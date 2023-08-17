package section01_Object_class.toString;

public class SomeObject {
    private int intField;
    private String stringField;

    public SomeObject(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }
}
