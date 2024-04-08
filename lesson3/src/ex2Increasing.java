import java.util.Scanner;

public class ex2Increasing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("please enter the first number");
        n1 = input.nextDouble();
        System.out.println("please enter the second number");
        n2 = input.nextDouble();
        System.out.println("please enter the third number");
        n3 = input.nextDouble();
        if(n1<n2 && n2<n3){
            System.out.println("increasing...");
        }
    }
}
