abstract public class Felines extends Mammals{
    float clawsSize;
    int speed;

    public Felines(String habitat, float height, float large, float weight, String scientificName, float clawsSize, int speed) {
        super(habitat, height, large, weight, scientificName);
        this.clawsSize = clawsSize;
        this.speed = speed;
    }

    public Felines(float clawsSize, int speed) {
        this.clawsSize = clawsSize;
        this.speed = speed;
    }

    public Felines() {
    }

    public float getClawsSize() {
        return clawsSize;
    }

    public int getSpeed() {
        return speed;
    }
}
