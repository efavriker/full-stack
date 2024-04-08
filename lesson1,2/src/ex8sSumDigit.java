import java.util.Scanner;

public class ex8sSumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sumD;
        System.out.println("Please enter number with two digits");
        num =input.nextInt();
        sumD = (num/10)+(num%10);
        System.out.printf("The sum digits of %d is %d",num,sumD);
    }
}
