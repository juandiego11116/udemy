public class Tiger extends Felines{

    String tigerSpecie;

    public Tiger(String habitat, float height, float large, float weight, String scientificName, float clawsSize, int speed, String tigerSpecie) {
        super(habitat, height, large, weight, scientificName, clawsSize, speed);
        this.tigerSpecie = tigerSpecie;
    }

    public String getTigerSpecie() {
        return tigerSpecie;
    }

    @Override
    public String Eat() {
        return "A tiger can consume more than 40 kg of meat at one time";
    }

    @Override
    public String Sleep() {
        return "Tiger sleep around 16 hours per day";
    }

    @Override
    public String run() {
        return "A tiger can run around 65KM/H";
    }

    @Override
    public String Communicate() {
        return "There are a number of vocalizations, such as purrs and growls," +
                " and the tiger also communicates with olfactory and visual cues such as urine," +
                " feces, and mood markings.";
    }
}
