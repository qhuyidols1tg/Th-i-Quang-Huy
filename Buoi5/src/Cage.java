import java.util.ArrayList;
public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetcount;
    private static int totalCages = 0;
    private final int MAX_CAPACITY = 3;

    public Cage(String cageCode, ArrayList<Pet> pets, int currentPetcount) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetcount = currentPetcount;
        totalCages++;
    }
    public void addPet(Pet pet){
        if(pets.size() > 3)
    }

    public Cage(){
        totalCages++;
    }

    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public int getCurrentPetcount() {
        return currentPetcount;
    }

    public void setCurrentPetcount(int currentPetcount) {
        this.currentPetcount = currentPetcount;
    }

    public int getTotalCages() {
        return totalCages;
    }

    public void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }


}
