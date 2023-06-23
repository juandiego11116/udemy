public class Lion extends Felines{
    int herdNumber;
    float roarPower;

    public Lion(String habitat, float height, float large, float weight, String scientificName, float clawsSize, int speed, int herdNumber, float roarPower) {
        super(habitat, height, large, weight, scientificName, clawsSize, speed);
        this.herdNumber = herdNumber;
        this.roarPower = roarPower;
    }

    public int getHerdNumber() {
        return herdNumber;
    }

    public float getRoarPower() {
        return roarPower;
    }

    @Override
    public String Eat() {
        return "Lion eat around 5 or 7 KGs of meat per day";
    }

    @Override
    public String Sleep() {
        return "Lion sleep around 20 hours per day";
    }

    @Override
    public String run() {
        return "Lion has maximum run 80 KM/H";
    }

    @Override
    public String Communicate() {
        return "Lions communicate by roaring";
    }
}
