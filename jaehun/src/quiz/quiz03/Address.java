package quiz.quiz03;

public class Address {
    private int code;
    private String city;

    public Address(int code, String city) {
        this.code = code;
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
