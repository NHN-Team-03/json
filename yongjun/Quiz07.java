package yongjun;

import org.json.JSONArray;
import org.json.JSONObject;

public class Quiz07 {
    public static void main(String[] args) {
        JSONArray animal = new JSONArray();
        JSONArray bird = new JSONArray().put("갈매기")
                .put("참새")
                .put("펭귄");
        JSONObject birdObject = new JSONObject().put("조류",bird);

        JSONArray mammal = new JSONArray().put("사자")
                .put("호랑이")
                .put("말");
        JSONObject mammalObject = new JSONObject().put("포유류", mammal);

        animal.put(birdObject)
                .put(mammalObject);
        JSONObject object = new JSONObject().put("동물", animal);

        System.out.println(object.toString());

    }
}
