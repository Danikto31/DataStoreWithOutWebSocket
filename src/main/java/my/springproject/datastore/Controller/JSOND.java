package my.springproject.datastore.Controller;

public class JSOND {
    public String key;
    public String value;

    public JSOND() {
    }

    // Конструктор с параметрами
    public JSOND(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String GetKey() {
        return key;
    }

    public String GetValue() {
        return value;
    }

}
