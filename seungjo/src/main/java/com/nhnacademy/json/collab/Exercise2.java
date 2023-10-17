package com.nhnacademy.json.collab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

public class Exercise2 {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("user.json");
            BufferedReader br = new BufferedReader(fileReader);

            String line;
            while((line = br.readLine()) != null) {
                JSONObject object = new JSONObject(line);

                System.out.println(object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
