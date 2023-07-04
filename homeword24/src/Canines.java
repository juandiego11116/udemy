abstract public class Canines extends Mammals{
    String color;
    float tuskSize;

    public Canines(String habitat, float height, float large, float weight, String scientificName, String color, float tuskSize) {
        super(habitat, height, large, weight, scientificName);
        this.color = color;
        this.tuskSize = tuskSize;
    }

    public Canines() {
    }

    public String getColor() {
        return color;
    }

    public float getTuskSize() {
        return tuskSize;
    }
}
