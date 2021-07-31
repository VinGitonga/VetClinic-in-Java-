public class Vet<V> {
    // Initialize local variables
    private V name;
    private V licence;

    // Getter methods
    public Vet(V name, V licence){
        this.name = name;
        this.licence = licence;
    }

    public V getName(){
        return this.name;
    }

    public V getLicence(){
        return this.licence;
    }
}
