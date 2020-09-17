package com.company;

public abstract class Parent implements Human, Object {
    protected int age;
    protected String name;

    Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
