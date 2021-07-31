import java.util.ArrayList;

public class Vets <V>{
    // Initialize an array to hold all vet doctors
    private ArrayList<Vet <V>> arrayVet = new ArrayList<>();
// Default constructor
    public Vets(){}

    // Method to add a vet doctor
    public boolean addVet(Vet<V> mu){
        if(arrayVet.contains(mu)){
            System.out.println("The vet already exists");
            return false;
        }else {
            System.out.println("Vet" + mu.getName() + " has been added");
            arrayVet.add(mu);
            return true;
        }
    }

    // Method to display all vets
    public void displayAllVets(){
        System.out.println("------" + "All Vets" + " -------");
        for (int i = 0; i<arrayVet.size(); i++){
            Vet<V> vet = arrayVet.get(i);
            System.out.println("#" + (i+1) + " " + vet.getName() + "|| License No: " + vet.getLicence());
        }
    }
}
