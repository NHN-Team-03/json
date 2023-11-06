package yongjun;

import org.json.JSONObject;

public class Quiz01 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        JSONObject addressObject = new JSONObject();
        addressObject.put("code", 13487);
        addressObject.put("city" , "seonam");

        object.put("name", "nhn");
        object.put("address", addressObject);

        System.out.println(object.toString());

    }
}
