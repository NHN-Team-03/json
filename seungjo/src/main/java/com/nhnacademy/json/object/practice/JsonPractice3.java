package com.nhnacademy.json.object.practice;

import org.json.JSONObject;

public class JsonPractice3 {

    public static class Address {
        private String city;
        private String postNumber;

        public Address(String city, String postNumber) {
            this.city = city;
            this.postNumber = postNumber;
        }

        public String getCity() {
            return this.city;
        }

        public String getPostNumber() {
            return this.postNumber;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setPostNumber(String postNumber) {
            this.postNumber = postNumber;
        }
    }

    public static class Person {

        private String name;
        private Address address;

        public Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return this.name;
        }

        public Address getAddress() {
            return this.address;
        }

        public void setName(String name) {
            this.name = name;
        }


        public void setAddress(Address address) {
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("seungjo", new Address("성남", "13487"));
        JSONObject object = new JSONObject(person);

        System.out.println(object.toString());
    }
}
