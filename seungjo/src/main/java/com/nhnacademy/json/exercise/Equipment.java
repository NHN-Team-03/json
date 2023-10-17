package com.nhnacademy.json.exercise;

public class Equipment {

    private String model;
    private int attackPower;
    private int defencePower;

    public Equipment(String model, int attackPower, int defencePower) {
        this.model = model;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }
}
