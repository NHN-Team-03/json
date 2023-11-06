package yongjun;

import org.json.JSONObject;

public class exam02 {

    public static void main(String[] args) {
        String jsonText = "{\"name\" : \"nhn\"}";
        JSONObject object = new JSONObject(jsonText);

        System.out.println(object.toString());
    }
}
