package exam;

import org.json.JSONException;
import org.json.JSONObject;

public class Exam02 {
    public static void main(String[] args) {
        try {
            JSONObject object = new JSONObject("{\"name\" : \"nhn\"}");

            System.out.println(object.toString());
        } catch (JSONException e) {
            System.out.println(e);
        }
    }
}
