package model;
public class Cat extends Animal {

    @Override
    void makeNoise() {
        System.out.println("Cat.makeNoise");
    }

    public Cat(String name, int age){
        super(name, age);
    }

}
