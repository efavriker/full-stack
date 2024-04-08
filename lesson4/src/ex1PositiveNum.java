import java.util.Scanner;

public class ex1PositiveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num,sum = 0;
        for (int i = 0; i <= 10; i++ )
        {
            System.out.println("Please enter number only positive numbers will be sum ");
            num = input.nextDouble();
            if (num > 0 ){
                sum += num;
            }

        }
        System.out.printf("The sum of the positive number is %1.2f",sum);
    }
}
