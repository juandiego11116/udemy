abstract public class Mammals {
    String habitat;
    float height;
    float large;
    float weight;
    String scientificName;

    public Mammals() {
    }

    public Mammals(String habitat, float height, float large, float weight, String scientificName) {
        this.habitat = habitat;
        this.height = height;
        this.large = large;
        this.weight = weight;
        this.scientificName = scientificName;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getHeight() {
        return height;
    }

    public float getLarge() {
        return large;
    }

    public float getWeight() {
        return weight;
    }

    public String getScientificName() {
        return scientificName;
    }
    abstract public String Eat();
    abstract public String Sleep();
    abstract public String run();
    abstract public String Communicate();
}
