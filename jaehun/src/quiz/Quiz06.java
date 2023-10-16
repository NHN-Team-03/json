package quiz;

import org.json.JSONArray;
import org.json.JSONObject;

public class Quiz06 {
    public static void main(String[] args) {
        String[] birds = new String[] {"갈매기", "참새", "펭귄"};
        String[] mammals = new String[] {"사자", "호랑이", "말"};

        JSONObject bird = new JSONObject();

        bird.put("조류", new JSONArray(birds));

        JSONObject mammal = new JSONObject();

        mammal.put("포유류", new JSONArray(mammals));

        JSONObject animal = new JSONObject();

        animal.put("동물", new JSONArray().put(bird).put(mammal));

        System.out.println(animal);
    }
}
