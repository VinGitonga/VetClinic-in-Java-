public class App {
    
    public static void main(String[] args) throws Exception {
        // Create instance of Class Vets
        Vets<String> newVets = new Vets<String>();
        // Create new Vets
        Vet<String> mu = new Vet<String>("Jacky", "14555");
        Vet<String> m2 = new Vet<String>("Riley", "15000");
        // Add the created vet doctors to the an Array
        newVets.addVet(mu);
        newVets.addVet(m2);

        // Create an instance of Class Owners
        Owners<String> owners = new Owners<String>();
        // Create new Owners
        Owner<String> own1 = new Owner<String>("Remy", "1451 Vegas");
        Owner<String> own2 = new Owner<String>("Joe", "1589 LA");
        // Add the created owners to an Array
        owners.addOwner(own1);
        owners.addOwner(own2);

        // Create an instance of Class Pets
        Pets<String> pets = new Pets<String>();
        // Generate Unique IDs for the Pets
        String pet1ID = pets.generateID();
        String pet2ID = pets.generateID();
        String pet3ID = pets.generateID();
        // Create new pets
        Pet<String> pet1 = new Pet<String>("Billy", "2020-06-11", pet1ID, own1);
        Pet<String> pet2 = new Pet<String>("Tom", "2020-11-01", pet2ID, own2);
        Pet<String> pet3 = new Pet<String>("Bingo", "2020-11-01", pet3ID, own2);

        // Save the pets into an array
        pets.addPet(pet1);
        pets.addPet(pet2);
        pets.addPet(pet3);

        // Create an instance of Class Treat
        Treat<String> treatments = new Treat<String>();
        // Create new treatments for each of the pets
        Treatment<String> tr1 = new Treatment<String>("2021-07-31", pet1, "Fever", "Conzole B", "2021-09-04", m2);
        Treatment<String> tr2 = new Treatment<String>("2021-08-02", pet2, "Wheezing", "Hupak k", "2021-08-31", m2);
        // Save treatments for each pet
        treatments.addTreatment(tr1);
        treatments.addTreatment(tr2);

        // Now display all owners, vet doctors, pets and treatments respectively
        owners.displayAllOwners();
        newVets.displayAllVets();
        pets.displayAllPets();
        treatments.displayAllTreatMents();
       
    }
}
