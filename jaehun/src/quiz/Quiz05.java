package quiz;

import org.json.JSONObject;

public class Quiz05 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject("{\"ModelId\" : \"K2\", \"Power\" : 10, \"Flyable\" : false}");

        String modelId = object.getString("ModelId");
        int power = object.getInt("Power");
        boolean flyable = object.getBoolean("Flyable");

        System.out.println("Model : " + modelId);
        System.out.println("Power : " +power);
        System.out.println("Flyable : " + flyable);
    }
}
