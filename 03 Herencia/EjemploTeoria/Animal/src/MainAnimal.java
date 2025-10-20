public class MainAnimal {
    public static void main(String[] args) throws Exception {
        Animal animals[] = new Animal[6];

        animals[0]=new Dog();
        animals[1]=new Wolf();
        animals[2]=new Hippo();
        animals[3]=new Lion();
        animals[4]=new Tiger();
        animals[5]=new Cat();

        recorrido(animals);
        hazRuido(animals).makeNoise();


    }

    public static void recorrido(Animal [] animals){
    for (int i = 0; i < animals.length; i++) {
        animals[i].makeNoise();
    }

    public static Animal hazRuido(Animal [] animals){
        return animals[4];
    }
        Dog dog1=new Dog();
        dog1.makeNoise();
        dog1.roam();
        

        Cat cat1=new Cat();
        cat1.makeNoise();
        cat1.roam();

        Tiger tiger1 = new Tiger();
        tiger1.makeNoise();
        tiger1.roam();

        Lion lion1=new Lion();
        lion1.makeNoise();
        lion1.roam();
    }


}
