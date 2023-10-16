package quiz;

import org.json.JSONObject;

public class Quiz04 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject("{\"address\":{\"code\":13487,\"city\":\"Seongnam\"},\"name\":\"nhn\"}");

        object.put("name", "academy");
        object.put("address", new JSONObject("{\"code\":50948,\"city\":\"Gimhae\"}"));

        System.out.println(object);

    }
}
