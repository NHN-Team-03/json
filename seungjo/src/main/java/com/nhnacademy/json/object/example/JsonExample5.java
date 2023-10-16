package com.nhnacademy.json.object.example;

import org.json.JSONObject;

public class JsonExample5 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("이름", "nhn");

        String name = object.getString("이름");
        System.out.println(name);
    }
}
