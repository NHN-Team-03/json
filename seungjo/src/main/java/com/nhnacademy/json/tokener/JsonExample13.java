package com.nhnacademy.json.tokener;

import org.json.JSONException;
import org.json.JSONTokener;

public class JsonExample13 {
    public static void main(String[] args) throws JSONException {

        JSONTokener tokener = new JSONTokener(System.in);

        while (tokener.more()) {
            System.out.println(tokener.nextValue());
        }
    }
}


