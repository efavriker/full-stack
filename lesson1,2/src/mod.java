import java.util.Scanner;

public class mod
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num,num2;
        System.out.println("Please enter number between 10 to 99");
        num = input.nextInt();
        num2 = (num%10)*10;
        num = num/10;
        num2 += (num%10);
        System.out.println("the number is "+ num2);
        // next exe
        double dnum ;
        double ndnum,reman;
        System.out.println("Please enter number double number");
        dnum = input.nextDouble();
        reman = dnum%2;
        ndnum = (dnum-reman)+2;

        System.out.println("the new number is " +ndnum);


    }
}
