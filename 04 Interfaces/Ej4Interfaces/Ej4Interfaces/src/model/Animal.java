package model;
public abstract class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age){
        this.age= age;
        this.name= name;
        makeNoise();
    }

    public Animal(){}

    public void eat(){
        System.out.println("Animal.eat()");
    }
    
    public void showInfo(){
        System.out.println("name= " + getName() + ", age= " + getAge());
    }
    
    abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

}
