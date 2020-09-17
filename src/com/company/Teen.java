package com.company;

public class Teen implements Human, Object {
    private int age;
    private String name;

    Teen(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void iWanna() {
        System.out.println("Ooof, I've finally got some new CS GO skins.");
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + ":\n" + "Sup. You can call me " + this.name + ". I'm " + this.age + ".");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Teen other = (Teen) obj;
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
