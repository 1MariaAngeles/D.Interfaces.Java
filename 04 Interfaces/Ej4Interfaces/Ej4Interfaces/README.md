Animal animals[] = new Animal[5];
        
        animals[0]=new Bird("Piolin", 1);
        animals[1]=new Cat("Tom", 7);
        animals[2]=new Dog("Goofy", 10);
        animals[3]=new Duck("Donald", 3);
        animals[4]=new Fish("Nemo", 0);

        Flyer fly[] = new Flyer[3];
        fly[0]= new Bird("Pajaro Loco", 9);
        fly[1]= new Duck("Tio Gilito", 110);

        Swimmer swim[] = new Swimmer[3];
        swim[0] = new Duck("Juanito", 10);
        swim[1]= new Fish("Dory", 2);

       recorrido(animals);
    }

    public static void recorrido(Animal[] animals) {
        for (Animal a : animals) {
        a.eat();
        a.showInfo();
        if (a instanceof Swimmer) ((Swimmer)a).swim();
        if (a instanceof Flyer) ((Flyer)a).fly();
    }
}
    /*public static void recorrido(Animal [] animals){
        for (int i = 0; i < animals.length; i++) {
            //makeNoise esta en el constructor de Animal
            animals[i].eat();
            animals[i].showInfo();   
            
            if (animals[i] instanceof Swimmer){
                recorridoSwim(null);
            }if (animals[i] instanceof Flyer) {
                recorridofly(null);
            } else {
                
            }
        }
    }

    public static void recorridofly(Flyer [] fly){
        for (int i = 0; i < fly.length; i++) {
            fly[i].fly();   
        }
    }
    public static void recorridoSwim(Swimmer [] swim){
        for (int i = 0; i < swim.length; i++) {
            swim[i].swim(); 
        }
    }*/