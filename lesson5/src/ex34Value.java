import java.util.Scanner;

public class ex34Value {
    //3.Write a Java program to test if an array contains a specific value
    //4.Write a Java program to find the index of an array element
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int num = input.nextInt();
        int [] arr = new int [num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number");
            arr[i] = input.nextInt();
        }
        int find,index = -1;
        System.out.println("Enter the number your are looking for in the array");
        find = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (find  == arr[i]){
                index = i;
                System.out.println("The number "+find+" is in the array in the index "+index);
                break;
            }
        }
        if (index == -1){
            System.out.println("The number "+find+" is not  in the array");
        }


    }

}
