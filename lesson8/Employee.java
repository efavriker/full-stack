package lesson8;

import java.time.LocalDate;
//encapsulation - private, default, private
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, Double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setDate(LocalDate date) {
        this.hireDay = date;
    }
    public LocalDate getDate() {
        return hireDay;
    }
    public void raiseSalary(int ByPercent){
        double raise = (ByPercent * this.salary)/100;
        this.salary += raise;
    }
    public String toString(){
        return STR."\{this.name} work at the compeny since \{this.hireDay} and his salary now is \{this.salary}";

    }
}
