import java.util.Scanner;

public class ex5Copy {
    public static void main(String[] args) {
        //5.Write a Java program to copy an array by iterating the array
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int num = input.nextInt();
        int [] arr = new int [num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number");
            arr[i] = input.nextInt();
        }
        int [] newArr = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length-1; i++) {
            System.out.print(newArr[i]+",");
        }
        System.out.println(newArr[arr.length-1]);

    }
}
