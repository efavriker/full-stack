import java.util.Scanner;

public class ex6SecondDigitRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,secRight;
        System.out.println("Please enter number with four digits ");
        num = input.nextInt();
        secRight = (num/10)%10;
        System.out.printf("The right second digit of %d is %d",num,secRight);
    }
}
