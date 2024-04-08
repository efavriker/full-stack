import java.util.Scanner;

public class ex6MinMax {
    //6.Write a Java program to find the maximum and minimum value of an array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size = input.nextInt();
        int [] array = new int [size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter the number");
            array[i] = input.nextInt();
        }
        int min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("The max number in the array is : "+max+" and the min number in the array is : "+min);
    }
}
