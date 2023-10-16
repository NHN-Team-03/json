package com.nhnacademy.json.object.example;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonExample1 {
    public static void main(String[] args) throws JSONException {

        JSONObject object = new JSONObject();
        object.put("이름", "seungjo");
        System.out.println(object.toString());
    }
}
