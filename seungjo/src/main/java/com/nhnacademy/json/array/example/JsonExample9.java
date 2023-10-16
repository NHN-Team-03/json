package com.nhnacademy.json.array.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample9 {
    public static void main(String[] args) {
        String[] cities = new String[]{"서울", "부산", "광주"};
        JSONArray array = new JSONArray();

        for (String city : cities) {
            array.put(city);
        }

        JSONObject object = new JSONObject();

        object.put("도시", array);

        System.out.println(object.toString());

    }
}
