public class Wolf extends Canines{
    int litterNumber;
    String wolfSpecie;

    public Wolf(String habitat, float height, float large, float weight, String scientificName, String color, float tuskSize, int litterNumber, String wolfSpecie) {
        super(habitat, height, large, weight, scientificName, color, tuskSize);
        this.litterNumber = litterNumber;
        this.wolfSpecie = wolfSpecie;
    }

    public int getLitterNumber() {
        return litterNumber;
    }

    public String getWolfSpecie() {
        return wolfSpecie;
    }

    @Override
    public String Eat() {
        return "a wolf "+ color + "can eat around one kilogram and a half";
    }

    @Override
    public String Sleep() {
        return "Wolf sleep around 8 hours per day";
    }

    @Override
    public String run() {
        return "A wolf can run between 50 KM/H and 60 KM/H";
    }

    @Override
    public String Communicate() {
        return "Wolves communicate with each other with howls, body language, and scent";
    }
}
