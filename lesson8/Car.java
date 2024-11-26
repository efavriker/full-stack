package lesson8;
/*
    create a car  class
      it should contain the following fields:
      - model, price, forSale(boolean flag), owner(name of the owner)
      - all the field should be private
      - constructor which get all field and set them using this keyword
      - we want that everyone could access the field(getters for all the fields)
      - we want allow only setModel to be public setter
      - we want to let set price and set forSale only to owner
        - create method setForSale(String owner,boolean forSale) and setPrice(String owner, double price) which will change
          the price only if the owner is the same as in method argument
        - create method setOwner(String newOwner) which should be private
        - create method sale(String owner, String newOwner)
            - the method check if forSale flag is true
            - the method check if owner is the same as owner parameter
            - if all the conditions held the method should change the owner to be a newOwner
         - add print to all methods so we will know what happened: "the price was changed", "the car was sold" and etc
 */
public class Car {
    private String model;
    private double price;
    private boolean forSale;
    private String owner;

    public Car(String model, double price, boolean forSale, String owner){
        this.model = model;
        this.price = price;
        this.forSale = forSale;
        this.owner = owner;
        System.out.println("The new user was set the owner is " +this.getOwner()+" and the model of the car is "+this.getModel());
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("The new model was changed");
    }

    public String getModel() {
        return model;
    }

    public void setPrice(String owner, double price) {
        if (owner.equals(this.owner)) {
            this.price = price;
            System.out.println("The price was changed to: "+ price);
        }
        else {
            System.out.println("The change of the price is allows to the owner only");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setForSale(String owner, boolean forSale) {
        if (owner.equals(this.owner)) {
            this.forSale = forSale;
            if(forSale) {
                System.out.println("The car now is for sale");
            }
            else {
                System.out.println("The car now is not for sale");
            }
        }
        else {
            System.out.println("Only the owner is allow to change the status of the car to sale");
        }

    }

    public boolean getForSale() {
        return forSale;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
    public void sale(String owner, String newOwner){
        if (owner.equals(this.owner)){
            setForSale(owner,true);
            if (getForSale()){
                setOwner(newOwner);
                System.out.println("the new owner of the car is "+ newOwner);
            }
        }
        else {
            System.out.println("Only the owner is allow to change the status of the car to sale");
        }

        }

}
