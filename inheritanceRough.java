package com.company;

class Animal{
    public void eat(){
        System.out.println("An Animal Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping Animal");
    }
}

class Dog extends Animal{
    public void Bark(){
        System.out.println("Wof Wof Wof...!");
    }
}

public class inheritanceRough {
    public static void main(String[] args) {
        Dog gypsy = new Dog();
        gypsy.Bark();
        gypsy.eat();
        gypsy.sleep();

    }
}
