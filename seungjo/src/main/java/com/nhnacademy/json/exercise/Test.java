package com.nhnacademy.json.exercise;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

public class Test {

    public static void main(String[] args) {
        JSONObject object = new JSONObject();

        object.put("name", "seungjo");
        object.put("age", 25);
        object.put("city", "Gwangju");

        try {

            FileWriter fileWriter = new FileWriter("test.json");

            fileWriter.write(object.toString());

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
