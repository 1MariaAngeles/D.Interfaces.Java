package model;

public class Bird extends Animal implements Flyer {
    
    public Bird(String name, int age){
        super(name, age);
    }

    @Override
    void makeNoise() {
        System.out.println("Bird.makeNoise");
    }

    @Override
    public void fly() { 
        System.out.println("Bird.fly()");
    }
        
}
