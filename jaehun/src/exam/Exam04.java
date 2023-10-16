package exam;

import org.json.JSONObject;

public class Exam04 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject();

        object.put("name", "nhn");
        System.out.println(object);

        object.put("name", "academy");
        System.out.println(object);
    }
}
