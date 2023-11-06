package yongjun;

import org.json.JSONObject;

public class Quiz02 {

    public static void main(String[] args) {
        String jsonText = "{\"address\" : {\"code\" : 13487, \"city\" : \"seongnam\"},\"name\" : \"nhn\"}";
        JSONObject object = new JSONObject(jsonText);

        System.out.println(object.toString());
    }
}
