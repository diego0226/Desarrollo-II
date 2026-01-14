public class Main {
    public static void main(String[] args) {
        //parte #1
        int[] numbers = {10, 20, 30, 40, 50};
        String[] fruits = new String[3];
        //System.out.println(numbers[2]);
        //System.out.println(fruits[2]);

        Person person = new Person("Diego", 18, 5);
        
        
        for(Pet pet: person.getPetManager().getPets()){
            System.out.println(pet.getPetName());
        }

        
    }

}
