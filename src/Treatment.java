public class Treatment<T> {
    // initialize local Variables
    private T dateOfTreatment;
    private Pet<T> pet;
    private T disease;
    private T medicine;
    private T nextVisitDate;
    private Vet<T> vet;

    // Parameterized Constructor
    public Treatment(T dateOfTreatment, Pet<T> pet, T disease, T medicine, T nextVisitDate, Vet<T> vet){
        this.dateOfTreatment = dateOfTreatment;
        this.pet = pet;
        this.disease = disease;
        this.medicine = medicine;
        this.nextVisitDate = nextVisitDate;
        this.vet = vet;
    }

    // Getter methods for the class
    public T getTreatmentDate(){
        return this.dateOfTreatment;
    }

    public T getPetOwnerName(){
        return this.pet.getOwnerName();
    }

    public T getPetName(){
        return this.pet.getName();
    }

    public T getDisease(){
        return this.disease;
    }

    public T getMedicine(){
        return this.medicine;
    }

    public T getNextVisitDate(){
        return this.nextVisitDate;
    }

    public T getVetName(){
        return this.vet.getName();
    }
}
