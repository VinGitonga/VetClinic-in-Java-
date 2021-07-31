public class Owner<W>{
    // Initialize local variables
    private W name;
    private W address;

    // Parameterized constructor
    public Owner(W name, W address){
        this.name = name;
        this.address = address;
    }

    // Getter methods
    public W getName(){
        return name;
    }

    public W getAddress(){
        return address;
    }

}
