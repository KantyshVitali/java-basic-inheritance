package com.company;

public class Baby implements Human, Object {

    private int age;
    private String name;

    Baby(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void iWanna() {
        System.out.println("*Wants to kill you with his toy revolver*");
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + ":\n" +  this.name + "... " + this.age + " ears old.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Baby other = (Baby) obj;
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
