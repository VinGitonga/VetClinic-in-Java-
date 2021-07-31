import java.util.*;

public class Owners<W>{
    // Initialize an array to hold all the owners
    private ArrayList<Owner <W>> arrayOwner = new ArrayList<>();

    // Method to add an Owner
    public boolean addOwner(Owner<W> owner){
        if(arrayOwner.contains(owner)){
            System.out.println("Owner already exists");
            return false;
        }else {
            System.out.println( "Pet Owner " + owner.getName() + " has been added Successfully");
            arrayOwner.add(owner);
            return true;
        }
    }
    // Method to display all Owners

    public void displayAllOwners(){
        System.out.println("------" + "All Pet Owners" + " ------");
        for (int i = 0; i<arrayOwner.size(); i++){
            Owner<W> owner = arrayOwner.get(i);
            System.out.println("#" + (i+1) + " " + owner.getName() + "|| Address" + owner.getAddress());
        }
    }
}
