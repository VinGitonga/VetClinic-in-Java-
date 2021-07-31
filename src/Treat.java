import java.util.ArrayList;

public class Treat<T> {
    // Initialize an array for all the treatments
    private ArrayList<Treatment <T>> arrayTreatments = new ArrayList<>();

    // method to add new treatment
    public boolean addTreatment(Treatment<T> treatment){
        if(arrayTreatments.contains(treatment)){
            System.out.println("Treatment already exists");
            return false;
        }else
            System.out.println("Treatment  for Pet " + treatment.getPetName() + " has been added successfully");
            arrayTreatments.add(treatment);
            return true;
    }

    // Method to display all treatments
    public void displayAllTreatMents(){
        System.out.println("------" + "All Treatments for All Pets" + " -------");
        for(int i = 0; i < arrayTreatments.size(); i++){
            Treatment<T> treatment = arrayTreatments.get(i);
            System.out.println(
                "#" + (i+1) + " Date of Treatment: " + treatment.getTreatmentDate() + ", Pet Name: " + treatment.getPetName() + ", Diseased Diagonised: "
                + treatment.getDisease() + ", Vet Name: " + treatment.getVetName() + ", Pet Owner: " + treatment.getPetOwnerName()
                 + ", Next Visit Date: " + treatment.getNextVisitDate()
            );
        }
    }
}
