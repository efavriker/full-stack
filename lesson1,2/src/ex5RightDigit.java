import java.util.Scanner;

public class ex5RightDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,right;
        System.out.println("Please enter number with four digits ");
        num = input.nextInt();
        right = num% 10;;
        System.out.printf("The right digit of the number is %d",right);
    }
}
