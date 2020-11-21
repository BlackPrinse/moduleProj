package com.company;

public class Soldier extends Person{
    private int servNum;
    private String milUtit;

    public Soldier() {
    }

    public Soldier(String name, int age, int servNum, String milUtit) {
        super(name, age);
        this.servNum = servNum;
        this.milUtit = milUtit;
    }

    public int getServNum() {
        return servNum;
    }

    public void setServNum(int servNum) {
        this.servNum = servNum;
    }

    public String getMilUtit() {
        return milUtit;
    }

    public void setMilUtit(String milUtit) {
        this.milUtit = milUtit;
    }
}
