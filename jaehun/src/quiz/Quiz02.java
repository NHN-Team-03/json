package quiz;

import org.json.JSONException;
import org.json.JSONObject;

public class Quiz02 {
    public static void main(String[] args) {
        try {
            JSONObject object = new JSONObject("{\"address\":{\"code\":13487,\"city\":\"Seongnam\"},\"name\":\"nhn\"}");

            System.out.println(object.toString());
        } catch (JSONException e) {
            System.out.println(e);
        }
    }
}
