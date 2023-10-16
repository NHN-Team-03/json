package com.nhnacademy.json.object.example;

import org.json.JSONObject;

public class JsonExample6 {
    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("이름", "nhn");

        // 아래의 코드는 오류를 발생시킴 !
        // int age = object.getInt("이름");
        // System.out.println(age);
    }
}
