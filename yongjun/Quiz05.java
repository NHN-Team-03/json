package yongjun;

import org.json.JSONObject;

public class Quiz05 {
    public static void main(String[] args) {
        String jsonString = "{\"model\":\"K2\",\"power\":10}";
        JSONObject object = new JSONObject(jsonString);

        System.out.println("model :" + object.getString("model"));
        System.out.println("power :" + object.getBigInteger("power"));
        System.out.println("flyable : " + object.optBoolean("flyable", false));


    }
}
