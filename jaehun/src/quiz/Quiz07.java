package quiz;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Quiz07 {
    public static void main(String[] args) throws JSONException{

        JSONArray animal = new JSONArray();

        JSONArray birdArray = new JSONArray();

        birdArray.put("갈매기");
        birdArray.put("참새");
        birdArray.put("펭귄");

        JSONArray mammalArray = new JSONArray();

        mammalArray.put("사자");
        mammalArray.put("호랑이");
        mammalArray.put("말");

        JSONObject bird = new JSONObject();

        bird.put("조류", birdArray);

        JSONObject mammal = new JSONObject();

        mammal.put("포유류", mammalArray);

        JSONObject object = new JSONObject();

        animal.put(bird);
        animal.put(mammal);

        object.put("동물", animal);

        System.out.println(object.toString());
    }
}
