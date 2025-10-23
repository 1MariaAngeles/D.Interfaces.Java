package model;

public class Dog extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Dog.makeNoise");
    }
    public Dog(String name, int age){
        super(name, age);
    }
}
