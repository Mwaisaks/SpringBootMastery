package com.mwaisaka;

public class Dev {

    Laptop laptop;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(int age) { //constructor injection
        this.age = age;
        System.out.println("Dev 1 constructor.");
    }

    public Dev (){
        System.out.println("Dev Constructor.");
    }
    public void build(){
        System.out.println("Working on an Awesome Project!");
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}

//ctrl + space
