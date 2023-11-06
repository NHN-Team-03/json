package yongjun;

import org.json.JSONArray;

public class Quiz08 {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();

        jsonArray.put("adsf");
        jsonArray.put(true);
        jsonArray.put(134);

        int index = -1;
        for (int i = 0; i < jsonArray.length() ; i++) {
            Object object = jsonArray.get(i);
            if(object instanceof Boolean){
                index = i+1;
            }
        }
        System.out.println(index);
    }
}
