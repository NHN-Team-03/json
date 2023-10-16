package com.nhnacademy.json.object.example;

import org.json.JSONObject;

public class JsonExample2 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject("{\"이름\" : \"seungjo\"}");

        System.out.println(object.toString());
    }
}
