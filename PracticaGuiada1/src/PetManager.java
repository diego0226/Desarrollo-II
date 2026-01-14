public class PetManager {
    private int size;
    private Pet[] pets;

    public PetManager () {
        size = 0;
        pets = new Pet[10];
    }
    
    public PetManager(int numberOfPets) {
        size = 0;
        pets = new Pet[numberOfPets];
    }

    public boolean addPet(Pet pet) {
        if (pet != null) {
            for (int i = 0; i < pets.length - 1; i++) {
                if (pets[i] == null) {
                    pet = pets[i];
                    size++;
                    return true;
                }
            }
        }
        return false;
    }

    public Pet[] getPets() {
        return pets;
    }
}
