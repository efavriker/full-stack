import java.util.Scanner;

public class ex5SumMul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sumE = 0, sumO = 1;
        System.out.println("Please enter a ten numbers in the even place it will sum and in the odd place multiply");
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                System.out.println("Please enter a number that you want to sum");
                sumE += input.nextDouble();
            }
            else {
                System.out.println("Please enter a number that you want to multiply ");
                sumO *= input.nextDouble();
            }

        }
        System.out.println("The sum of the numbers in the even places is "+ sumE);
        System.out.println("The multiply of the numbers in the odd places is "+ sumO);
    }
}
