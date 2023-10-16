package com.nhnacademy.json.object.example;

import org.json.JSONObject;

public class JsonExample3 {
    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("seungjo");

        JSONObject object = new JSONObject(person);

        System.out.println(object.toString());
    }
}
