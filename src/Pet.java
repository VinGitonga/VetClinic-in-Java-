public class Pet<P> {
    private P name; // This is the name of the pet
    private P dob; // The Pet's Date of birth
    private P petID; // The Pet's Unique ID
    private Owner<P> owner; // This Owner variable

    // Parameterized contructor
    public Pet(P name, P dob, P petID, Owner<P> owner){
        this.name = name;
        this.dob = dob;
        this.petID = petID;
        this.owner = owner;
    }

    // getter methods
    public P getName(){
        return this.name;
    }


    public P getDOB(){
        return this.dob;
    }

    public P getPetID(){
        return this.petID;
    }

    public P getOwnerName(){
        return this.owner.getName();
    }


}
