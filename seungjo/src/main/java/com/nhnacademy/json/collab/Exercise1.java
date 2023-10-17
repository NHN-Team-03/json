package com.nhnacademy.json.collab;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

public class Exercise1 {

    public static void main(String[] args) {


        UserInfo userInfo = new UserInfo("dbdydwns1234", "유용준");
        JSONObject infoObject = new JSONObject(userInfo);

        JSONArray itemArray = new JSONArray();
        Item item = new Item("죽음의 무도", 55, 45);
        JSONObject itemObject = new JSONObject(item);

        Record record = new Record(10, 8);
        JSONObject recordObject = new JSONObject(record);

        JSONObject user = new JSONObject();
        user.put("userInfo", infoObject);
        user.put("item", itemObject);
        user.put("record", recordObject);
        user.put("log", "NULL");

        System.out.println(user);

        try {
            FileWriter file = new FileWriter("user.json");
            file.write(user.toString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
