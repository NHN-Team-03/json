package com.nhnacademy.json.object.example;

import org.json.JSONObject;

public class JsonExample7 {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject("{\"모델\" : \"K2\", \"공격력\" : 10, \"무한궤도형\" : true}");

        String model = jsonObject.getString("모델");
        int damage = jsonObject.getInt("공격력");
        boolean type = jsonObject.getBoolean("무한궤도형");

        System.out.println("모델 : " + model);
        System.out.println("공격력 : " + damage);
        System.out.println("무한궤도형 : " + type);

    }
}
