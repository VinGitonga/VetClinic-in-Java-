import java.util.*;

public class Pets<P> {
    // Initialize an array to hold all pets
    private ArrayList<Pet <P>> arrayPet = new ArrayList<>();

    // default constructor
    public Pets(){}

    // method to add a pet
    public boolean addPet(Pet<P> pet){
        if(arrayPet.contains(pet)){
            System.out.println("Pet already exists");
            return false;
        }else {
            System.out.println("Pet " + pet.getName() + " has been addded successfully");
            arrayPet.add(pet);
            return true;
        }
    }

    // Method to display all pets
    public void displayAllPets(){
        System.out.println("------" + "All Pets" + "------");
        for (int i = 0; i < arrayPet.size(); i++){
            Pet <P> pet = arrayPet.get(i);
            System.out.println("#" + (i+1) + " Pet Name: " + pet.getName() + ", Pet Owner: " + pet.getOwnerName() + " , Pet ID: " + pet.getPetID());
        }
    }

    // Method to generate unique id for all pets
    public String generateID(){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String uuid_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int uuid_length = 6;
        for (int i = 0; i < uuid_length; i++){
            sb.append(uuid_chars.charAt(random.nextInt(uuid_chars.length())));
        }

        return sb.toString();
    }
}
