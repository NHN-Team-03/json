package com.nhnacademy.json.collab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {

    private UserInfo userInfo;
    private List<Item> itemList = new ArrayList<>();
    private Record record;
    private String log;

    public User(UserInfo userInfo, Record record, Item... items) {
        this.userInfo = userInfo;
        this.itemList.addAll(Arrays.asList(items));
        this.record = record;
        this.log = "";
    }


    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}