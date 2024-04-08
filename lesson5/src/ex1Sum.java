import java.util.Scanner;

public class ex1Sum {
    public static void main(String[] args) {
        Scanner inner = new Scanner(System.in);
        System.out.println("Please enter the the length of the array");
        int len = inner.nextInt();
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number to the array");
            array[i]= inner.nextInt();
        }

        int sum=0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }


        System.out.println("The sum of the array numbers is "+ sum);
    }
}
