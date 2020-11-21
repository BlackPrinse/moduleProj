package com.company;

public class Person implements Able2War {
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean fight(String score) throws NotAble2WarExeption{
        if (age < 21)
            throw new NotAble2WarExeption("Age under 21");
        return true;
    }
    public String report() throws NotAble2WarExeption{
        if (name == null || name == " ")
            throw new NotAble2WarExeption("Name is null or name is empty");
        return name;

    }

}

