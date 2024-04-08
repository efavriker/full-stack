import java.util.Scanner;

public class ex8SalIncreas {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int salary;
        double extra;
        System.out.println("Please enter your salary");
        salary = input.nextInt();
        extra = salary*0.1;
        if ((salary + extra) < 6000) {
            System.out.printf("Your  new salary is  %d",(salary+extra));
        }
        else {
            extra = salary*0.05;
        }
    }
}
