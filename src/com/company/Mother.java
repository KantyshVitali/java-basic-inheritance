package com.company;

import java.util.Objects;

public class Mother extends Parent {

    Mother(int age, String name) {
        super(age, name);
    }

    @Override
    public void iWanna() {
        System.out.println("I wanna meet with my friends.");
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + ":\n" + "Hey, my name is " + name + ".\nI am " + age + " years old.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mother other = (Mother) obj;
        if (age != other.age)
            return false;
        if (name != other.name)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " " + age;
    }
}
