public class Dog extends Canines{
    int bitePSI;

    public Dog(String habitat, float height, float large, float weight, String scientificName, String color, float tuskSize, int bitePSI) {
        super(habitat, height, large, weight, scientificName, color, tuskSize);
        this.bitePSI = bitePSI;
    }

    public int getBitePSI() {
        return bitePSI;
    }

    @Override
    public String Eat() {
        return "A dog can eat around 200 to 600 grams per day";
    }

    @Override
    public String Sleep() {
        return "Dog sleep around 13 hours per day";
    }

    @Override
    public String run() {
        return "English Galgo can run approximately 72 Km/h ";
    }

    @Override
    public String Communicate() {
        return "Dogs communicate with visual cues such as body posture," +
                " head position, ear position, tail position, and even their fur.";
    }
}
