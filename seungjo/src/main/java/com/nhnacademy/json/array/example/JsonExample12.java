package com.nhnacademy.json.array.example;

import org.json.JSONArray;

public class JsonExample12 {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();

        jsonArray.put("true");
        jsonArray.put(1);
        jsonArray.put(true);

        int count = 0;
        for (Object obj : jsonArray) {
            count++;
            if (obj instanceof Integer) {
                System.out.println(obj.toString() + "의 위치는 " + count + "번째 입니다.");
            }
        }
    }
}
