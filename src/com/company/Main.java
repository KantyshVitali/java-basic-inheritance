package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age;
        String name;
        Scanner in = new Scanner(System.in);

        System.out.print("Input mother's age: ");
        age = in.nextInt();
        System.out.print("Input mother's name: ");
        in.nextLine();
        name = in.nextLine();
        Mother mother = new Mother(age, name);
        mother.print();
        mother.iWanna();

        System.out.println(mother);

        Mother motherNew1 = new Mother(age, name);
        Mother motherNew2 = new Mother(1111, "213321312");

        System.out.println("----------------------------------");

        System.out.print("\nInput father's age: ");
        age = in.nextInt();
        System.out.print("Input father's name: ");
        in.nextLine();
        name = in.nextLine();
        Father father = new Father(age, name);
        father.print();
        father.iWanna();

        System.out.println(father);
        System.out.println("----------------------------------");

        System.out.print("\nInput baby's age: ");
        age = in.nextInt();
        System.out.print("Input baby's name: ");
        in.nextLine();
        name = in.nextLine();
        Baby baby = new Baby(age, name);
        baby.print();
        baby.iWanna();

        System.out.println(baby);
        System.out.println("----------------------------------");

        System.out.print("\nInput teen's age: ");
        age = in.nextInt();
        System.out.print("Input teen's name: ");
        in.nextLine();
        name = in.nextLine();
        Teen teen = new Teen(age, name);
        teen.print();
        teen.iWanna();

        System.out.println(teen);
        System.out.println("----------------------------------");


        System.out.println(mother == mother);
        System.out.println(mother == null);
        System.out.println(mother.equals(father));

        System.out.println(mother == motherNew1); // == для ссылочных типов (объект Mother) сравнивает ссылки, для примитивных - значения
        System.out.println(mother.equals(motherNew1));

        System.out.println(mother.equals(motherNew2));

        System.out.println("----------------------------------");

        Teen newTeen = new Teen(19, "Mark");
        System.out.println(newTeen.hashCode());
        System.out.println(newTeen.hashCode());
        newTeen.setAge(20);
        System.out.println(newTeen.hashCode());
        newTeen.setName("George");
        System.out.println(newTeen.hashCode());
    }
}
