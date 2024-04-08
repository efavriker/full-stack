import java.util.Scanner;

public class ex7factor {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num,result =1;
        System.out.println("Please enter a number");
        num = input.nextInt();
        for (int i = 1; i <= num;i++)
        {
            result *= i;
        }
        System.out.printf("The factorial of %d! = %d",num,result);
        System.out.println("Please enter a positive number and less then 10 ");
        do {
            System.out.println("The number is not positive number and less then 10");
            System.out.println("Please enter a positive number and less then 10 ");
            num = input.nextInt();

        }while(num < 10 && num >0 );

        for (int i = 1; i <= num;i++)
        {
            result *= i;
        }
        System.out.printf("The factorial of %d! = %d",num,result);

    }
}
