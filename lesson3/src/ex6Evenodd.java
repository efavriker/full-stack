import java.util.Scanner;

public class ex6Evenodd {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int num,evodd;
        System.out.println("Please enter your number");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
