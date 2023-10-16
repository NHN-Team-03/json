package com.nhnacademy.json.object.practice;

import org.json.JSONObject;

public class JsonPractice2 {
    public static void main(String[] args) {
        JSONObject information = new JSONObject(
                "{ \"address\" : {\"city\" : \"성남\", \"postNumber\" : 13487}, \"name\" : \"seungjo\"}"
        );

        System.out.println(information.toString());
    }
}
