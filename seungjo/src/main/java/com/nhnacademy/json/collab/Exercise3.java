package com.nhnacademy.json.collab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Exercise3 {

    public static void main(String[] args) {

        JSONObject object = new JSONObject();
        int count = 1;

        try {
            FileReader fileReader = new FileReader("user.json");

            BufferedReader br = new BufferedReader(fileReader);

            String line;

            while ((line = br.readLine()) != null) {
                JSONTokener tokener = new JSONTokener(line);
                object.put("user" + count, tokener.nextValue());

                System.out.println(object);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
