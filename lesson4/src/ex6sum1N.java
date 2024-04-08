import java.util.Scanner;

public class ex6sum1N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num,sum = 1;
        System.out.println("Please enter a num form 1 to 1/n");
        num = input.nextDouble();
        for (double i = 2; i <= num; i++) {
            sum += 1/i;

        }
        System.out.printf("The sum is %1.2f",sum);

    }
}
