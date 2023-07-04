public class MammalsExample {
    public static void main(String[] args) {
        Mammals[] mammal = new Mammals[5];

        Mammals lion = new Lion("Africa",120,200, 90, "4", 3,
                80,10,110);
        Mammals tiger = new Tiger("Asia", 150, 250,130,"de",5,
                70,"fj");
        Mammals cheetah = new Cheetah("Africa",90, 180, 60,"hola", 4,
                120);
        Mammals wolf = new Wolf("Alaska", 40, 180, 70, "Hola", "Gray",
                3, 6, "Gray") ;
        Mammals dog = new Dog("Domestic", 90, 120,35, "dog",
                "while", 3, 12);
        mammal[0] = lion;
        mammal[1] = tiger;
        mammal[2] = cheetah;
        mammal[3] = wolf;
        mammal[4] = dog;

        for (Mammals animal: mammal){
            System.out.println("animal.scientificName = " + animal.scientificName);
        }

    }
}
