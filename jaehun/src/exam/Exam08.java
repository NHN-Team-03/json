package exam;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Exam08 {
    public static void main(String[] args) {
        String[] cities = new String[] {"서울", "부산", "광주"};

        JSONArray jsonArray = new JSONArray();

        for(int i = 0; i < cities.length; i++) {
            jsonArray.put(cities[i]);
        }

        JSONObject object = new JSONObject();

        object.put("도시", jsonArray);

        System.out.println(object.toString());
    }
}
