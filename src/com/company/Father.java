package com.company;

public class Father extends Parent {
    Father(int age, String name) {
        super(age, name);
    }

    @Override
    public void iWanna() {
        System.out.println("LET ME GET SOME BEER!");
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + ":\n" + "Halo, you, filthy dumbass! You can call me Daddy but actually I am " + name + ".\nMy age is " + age + ".");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Father other = (Father) obj;
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
