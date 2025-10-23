package model;

public class Duck extends Animal implements Flyer,Swimmer{

    @Override
    public void swim() {
        System.out.println("Duck.swim()");
    }

    @Override
    public void fly() {
        System.out.println("Duck.fly");
    }

    @Override
    void makeNoise() {
        System.out.println("Duck.makeNoise()");
    }

    public Duck(String name, int age){
        super(name, age);
    }
}
