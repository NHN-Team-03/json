package yongjun;

import org.json.JSONObject;

public class exam01 {

    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("name", "nhn");

        System.out.println(object.toString());

    }
}
