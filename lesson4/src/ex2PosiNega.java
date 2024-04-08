import java.util.Scanner;

public class ex2PosiNega {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num,sumP = 0 ,sumN = 0;
        for (int i = 0; i <= 10; i++ )
        {
            System.out.println("Please enter number ");
            num = input.nextDouble();
            if (num > 0 ){
                sumP += num;
            }
            else{
                sumN += num;
            }

        }
        System.out.printf("The sum of the positive number is %1.2f",sumP);
        System.out.printf("The sum of the negative number is %1.2f",sumN);

    }
}
