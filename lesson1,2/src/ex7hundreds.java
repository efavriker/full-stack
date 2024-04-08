import java.util.Scanner;

public class ex7hundreds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,hund;
        System.out.println("Enter number with three digits");
        num = input.nextInt();
        hund = num/100;
        System.out.printf("The hundreds of %d is %d ",num,hund);
    }
}
