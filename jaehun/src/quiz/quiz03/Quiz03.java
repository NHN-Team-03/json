package quiz.quiz03;

import org.json.JSONObject;

public class Quiz03 {
    public static void main(String[] args) {
        Person person = new Person("nhn", new Address(13487, "Seongnam"));

        JSONObject object = new JSONObject(person);

        System.out.println(object.toString());

    }
}
