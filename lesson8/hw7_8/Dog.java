package lesson8.hw7_8;

public class Dog {
    private String  name;
    private int age;
    private String spice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpice() {
        return spice;
    }

    public void setSpice(String spice) {
        this.spice = spice;
    }

    public void bark(){
        System.out.println("woof woof");
    }
    public String toString(){

        return STR."The dog name is \{this.name} it spice is \{this.spice} and it age is \{this.age}";
    }



}
