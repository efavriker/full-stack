package lesson8;

public class Office {
    private String street;
    private int zip;
    private int buildingNumber;
    private String city;
    private String country;
    private String name;
    private int numberOfPlace;

    public void changeAddress(String street, int buildingNumber,String city,int zip){
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.zip =zip;
        this.country = null;
        this.name = null;
        this.numberOfPlace = 0;
    }
}
