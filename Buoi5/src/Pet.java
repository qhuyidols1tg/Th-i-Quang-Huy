public class Pet {
    private String name;
    private double weight;
    private String species;

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void printInfo(){
        System.out.println("Tên thú cưng: " + name + ", Cân nặng: " + weight);
    }
    public static boolean isOverweight(double weight) {
        return weight > 10;
    }
    public void BasicInfo(){
        System.out.println("Tên: " + name + ", Loài: " + species);
    }
}
