package com.nhnacademy.json.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

public class Exercise2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("user.json");
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();
            JSONObject object = new JSONObject(line);
            System.out.println(object.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
