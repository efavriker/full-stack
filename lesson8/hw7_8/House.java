package lesson8.hw7_8;

public class House {
    private final String address;
    private final float field;
    private String owner;

    public House(String address, float field,String owner) {
        this.address = address;
        this.field = field;
        this.owner = owner;
    }
    public House(String address,float field){
        this.address = address;
        this.field = field;
    }
}
