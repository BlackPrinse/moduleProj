package com.company;

public class Commander extends Person{
    private int servNum;
    private String minUnit;
    private Soldier[] soldiers;

    public Commander() {
    }

    public Commander(String name, int age, int servNum, String minUnit) {
        super(name, age);
        this.servNum = servNum;
        this.minUnit = minUnit;
    }

    public int getServNum() {
        return servNum;
    }

    public void setServNum(int servNum) {
        this.servNum = servNum;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public Soldier[] getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(Soldier[] soldiers) {
        this.soldiers = soldiers;
    }
}
