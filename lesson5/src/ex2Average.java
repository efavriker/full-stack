import java.util.Scanner;

public class ex2Average {

    // 2. Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int [] array = new int [num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number");
            array[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
               sum += array[i];
        }
        System.out.println("The average of the array numbers is :"+(sum/ array.length));
    }
}
