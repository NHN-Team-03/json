package quiz;

import org.json.JSONException;
import org.json.JSONObject;

public class Quiz01 {
    public static void main(String[] args) {
        try {
            JSONObject object = new JSONObject();
            JSONObject object2 = new JSONObject();

            object2.put("code", 13487);
            object2.put("city", "Seongnam");
            object.put("address", object2);
            object.put("name", "nhn");

            System.out.println(object.toString());

        } catch (JSONException e) {
            System.out.println(e);
        }
    }
}
