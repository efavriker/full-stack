package lesson8;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, Double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " the bonus is: " + this.bonus ;
    }
}
