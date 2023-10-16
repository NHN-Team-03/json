package com.nhnacademy.json.object.practice;

import org.json.JSONObject;

public class JsonPractice1 {

    public static void main(String[] args) {
        JSONObject information = new JSONObject();
        information.put("이름", "seungjo");

        JSONObject address = new JSONObject();
        address.put("우편번호", 13487);
        address.put("도시", "성남");

        information.put("주소", address);

        System.out.println(information.toString());
    }
}
