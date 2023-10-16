package exam.exam03;

import org.json.JSONObject;

public class Exam03 {
    public static void main(String[] args) {
        Person person = new Person("nhn");

        JSONObject object = new JSONObject(person);

        System.out.println(object.toString());
    }
}
