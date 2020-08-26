package com.svlugovoy;

public class Main2 {
    public static void main(String[] args) {

        //todo: Пример позднего связывания

        //todo: overriding vs overloading

        //todo: overriding with exception

    }
}

class Animal {

    public void sayHello() {
        System.out.println("Animal - hello!");
    }

    public static void doSmth() {
        System.out.println("Static method in Animal class");
    }
}

class Dog extends Animal {

    public void sayHello() {
        System.out.println("Dog - hello!");
    }

    public static void doSmth() {
        System.out.println("Static method in Dog class");
    }

    public void dogSpecificMethod() {
        System.out.println("dogMethod method in Dog class");
    }
}

class Cat extends Animal {

    public void sayHello(){
        System.out.println("Cat - hello!");
    }
}
