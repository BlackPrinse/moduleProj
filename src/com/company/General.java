package com.company;

public class General extends Person{
    private int servNum;
    private String milUnit;

    private Commander[] commanders;

    public General() {
    }

    public General(String name, int age, int servNum, String milUnit) {
        super(name, age);
        this.servNum = servNum;
        this.milUnit = milUnit;
    }

    public int getServNum() {
        return servNum;
    }

    public void setServNum(int servNum) {
        this.servNum = servNum;
    }

    public String getMilUnit() {
        return milUnit;
    }

    public void setMilUnit(String milUnit) {
        this.milUnit = milUnit;
    }

    public Commander[] getCommanders() {
        return commanders;
    }

    public void setCommanders(Commander[] commanders) {
        this.commanders = commanders;
    }
}
