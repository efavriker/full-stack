import java.util.Scanner;

public class ex7Commen {
    //7.Write a Java program to find the common elements between two arrays of integers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the first array");
        int size1 = input.nextInt();
        int [] arr1 = new int [size1];
        for (int i = 0; i < size1; i++) {
            System.out.println(" fill number in the array");
            arr1[i] = input.nextInt();
        }
        int size2 = input.nextInt();
        int [] arr2 = new int [size1];
        for (int i = 0; i < size1; i++) {
            System.out.println(" fill number in the array");
            arr2[i] = input.nextInt();
        }
        int commen = 0;
        int size3 =(size2 >size1)?size1:size2;
        int [] arr3 = new int [size3];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[commen++] = arr1[i];
                }
            }


        }
        for (int i = 0; i < size3-1; i++) {
            System.out.print(arr3[i]+",");
        }
        System.out.println(arr3[arr3.length-1]);

    }

}
