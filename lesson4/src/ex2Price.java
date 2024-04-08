import java.util.Scanner;

public class ex2Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price, sum = 0 ,max;
        System.out.println("Please enter the max price of the buying");
        max = input.nextInt();
        do {
            System.out.println("Ter the price of the product");
            price = input.nextInt();
            sum += price;

        }while (sum <= max);
    }
}
