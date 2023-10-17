package com.nhnacademy.json.collab;

public class Item {
    private String model;
    private int attack;
    private int armor;

    public Item(String model, int attack, int armor) {
        this.model = model;
        this.attack = attack;
        this.armor = armor;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
