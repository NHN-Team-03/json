package com.nhnacademy.json.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class Exercise1 {

    public static class Data {
        private User user;
        private List<Equipment> equipmentList = new ArrayList<>();
        private Record record;
        private int changeCount;

        public int getChangeCount() {
            return changeCount;
        }

        public void setChangeCount(int changeCount) {
            this.changeCount = changeCount;
        }

        public Data(User user, List<Equipment> equipmentList, Record record) {
            this.user = user;
            this.equipmentList = equipmentList;
            this.record = record;
            this.changeCount = 0;
        }

        public Data(User user, Equipment equipment, Record record) {
            this.user = user;
            this.record = record;
            this.equipmentList.add(equipment);
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public List<Equipment> getEquipmentList() {
            return equipmentList;
        }

        public void setEquipmentList(List<Equipment> equipmentList) {
            this.equipmentList = equipmentList;
        }

        public Record getRecord() {
            return record;
        }

        public void setRecord(Record record) {
            this.record = record;
        }

        public void addEquipment(Equipment equipment) {
            this.equipmentList.add(equipment);
        }

    }
    public static void main(String[] args) {
        User user = new User("seungjo", "f1v3");
        JSONObject userObject = new JSONObject(user);

        Equipment equipment = new Equipment("죽음의 무도", 50, 30);
        JSONObject equipObject = new JSONObject(equipment);

        Record record = new Record(10, 8);
        JSONObject recordObject = new JSONObject(record);

        Data data = new Data(user, equipment, record);
        JSONObject dataObject = new JSONObject(data);
        System.out.println(dataObject.toString());

        try {
            FileWriter file = new FileWriter("user.json");
            file.write(dataObject.toString());

            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
