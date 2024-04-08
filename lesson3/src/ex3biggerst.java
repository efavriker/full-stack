import java.util.Scanner;

public class ex3biggerst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1,n2,n3,larger;
        System.out.println("Please enter the first number");
        n1 = input.nextDouble();
        System.out.println("Please enter the second number");
        n2 = input.nextDouble();
        System.out.println("please enter the third number");
        n3 = input.nextDouble();
        larger = n1 <= n2 ? n2 : n1;
        larger = n2 <= n3 ? n3 : n2;
        System.out.printf("The larger number is %1.2f", larger);

    }
}
