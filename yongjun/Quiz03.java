package yongjun;

import example.exam03.Person;
import org.json.JSONObject;

public class Quiz03 {
    public static void main(String[] args) {
        Person person = new Person("nhn", 134578, "sungnam");
        JSONObject object = new JSONObject(person);
        System.out.println(object.toString());
    }
}
