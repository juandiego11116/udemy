public class Cheetah extends Felines{
    public Cheetah(String habitat, float height, float large, float weight, String scientificName, float clawsSize, int speed) {
        super(habitat, height, large, weight, scientificName, clawsSize, speed);
    }

    @Override
    public String Eat() {
        return "Cheetah eat around 2 KGs of meat per day";

    }

    @Override
    public String Sleep() {
        return "Cheetah sleep around 12 hours per day";
    }

    @Override
    public String run() {
        return "A cheetah can run between 80 KM/H and 130 KM/H";
    }

    @Override
    public String Communicate() {
        return "There are a number of vocalizations, such as purrs and growls," +
                " and the tiger also communicates with olfactory and visual cues such as urine," +
                " feces, and mood markings.";
    }
}
