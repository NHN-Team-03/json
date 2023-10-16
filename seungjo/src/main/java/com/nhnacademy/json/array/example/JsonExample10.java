package com.nhnacademy.json.array.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample10 {
    public static void main(String[] args) {

        // {"동물":[{"조류":["갈매기","참새","펭귄"]},{"포유류":["사자","호랑이","말"]}]}

        String[] bird = {"갈매기", "참새", "펭귄"};
        String[] mammal = {"사자", "호랑이", "말"};

        JSONArray birdArray = new JSONArray(bird);
        JSONArray mammalArray = new JSONArray(mammal);

        JSONObject birdObject = new JSONObject();
        birdObject.put("조류", birdArray);

        JSONObject mammalObject = new JSONObject();
        mammalObject.put("포유류", mammalArray);

        JSONArray animalArray = new JSONArray();
        animalArray.put(birdObject);
        animalArray.put(mammalObject);

        JSONObject animal = new JSONObject();
        animal.put("동물", animalArray);

        System.out.println(animal.toString());

    }
}
