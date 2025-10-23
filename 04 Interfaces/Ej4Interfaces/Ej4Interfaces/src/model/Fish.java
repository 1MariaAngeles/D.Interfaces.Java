package model;

public class Fish extends Animal implements Swimmer{

    @Override
    public void swim() {
        System.out.println("Fish.swim()");
    }

    @Override
    void makeNoise() {
        System.out.println("Fish.makeNoise()");
    }

    public Fish(String name, int age){
        super(name, age);
    }

}
