package com.nhnacademy.json.array.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample8 {
    public static void main(String[] args) {

        JSONObject animal = new JSONObject();

        String[] birds = new String[]{"갈매기", "참새", "펭귄"};
        String[] mammals = new String[]{"사자", "호랑이", "말"};


        JSONArray birdArray = new JSONArray(birds);
        JSONArray mammalArray = new JSONArray(mammals);

        JSONObject birdObject = new JSONObject();
        birdObject.put("조류", birdArray);

        JSONObject mammalObject = new JSONObject();
        mammalObject.put("포유류", mammalArray);

        JSONArray animalArray = new JSONArray();
        animalArray.put(birdObject);
        animalArray.put(mammalObject);

        animal.put("동물", animalArray);

        System.out.println(animal.toString());


    }
}
