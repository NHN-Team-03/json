package com.nhnacademy.json.object.example;

import org.json.JSONObject;

public class JsonExample4 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("이름", "nhn");
        System.out.println(object.toString());

        object.put("이름", "academy");
        System.out.println(object.toString());
    }
}
