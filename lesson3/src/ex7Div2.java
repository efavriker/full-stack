import java.util.Scanner;

public class ex7Div2 {

        public static void main(String[] args) {
            Scanner input  = new Scanner(System.in);
            int num1,num2;
            System.out.println("Please enter your first number");
            num1 = input.nextInt();
            System.out.println("Please enter your second number");
            num2 = input.nextInt();
            if (num1 % num2 == 0) {
                System.out.printf("The %d is divided %d",num2,num1);
            }
            if (num2 % num1 == 0) {
                System.out.printf("The %d is divided %d",num1,num2);
            }
        }


}
