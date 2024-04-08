import java.util.Scanner;

public class ex1ShowValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1,num2,num3,ave ;
        System.out.println("please enter the first number ");
        num1 = input.nextDouble();
        System.out.println("please enter the second number ");
        num2 = input.nextDouble();
        System.out.println("please enter the third number ");
        num3 = input.nextDouble();
        ave = (num1+ num2 + num3)/3;
        System.out.println("the average of the three numbers is "+ ave);

    }
}
