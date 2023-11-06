package yongjun;

import org.json.JSONArray;
import org.json.JSONObject;

public class Quiz06 {
    public static void main(String[] args) {
        String[] birds = new String[] { "갈매기", "참새", "펭귄" };
        String[] mammals = new String[] { "사자", "호랑이", "말" };
        JSONObject object = new JSONObject()
                .put("동물", new JSONArray()
                        .put(new JSONObject().put("조류", new JSONArray(birds)))
                        .put(new JSONObject().put("포유류", new JSONArray(mammals))));
        System.out.println(object.toString());
    }
}
