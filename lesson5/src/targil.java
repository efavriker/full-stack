import java.lang.reflect.Array;
import java.util.Scanner;

public class targil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double max = 0 , num = 0,ave = 0;
        int index = 0,natural,temp = 0,x,y,result, flag,sum = 0 ;
        String str = "";

    /*
     //Input 5 numbers show the value and the index of the highest number.
        System.out.println("Please five numbers");
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number");
            num = input.nextDouble();
            if (num > max){
                max = num;
                index = i;
            }
        }
        System.out.printf("The max number from the five numbers is %1.2f and his index is %d ",max,index);

        //input natural number show sum of its digits
        System.out.println("Please enter a natural number");
        natural = input.nextInt();
        System.out.printf("The sum of the digits of %d is ",natural);
        while (natural != 0) {
            temp +=(natural%10);
            natural /= 10;
        }
        System.out.println(temp);

        //Input two natural positive numbers x and y  and show the x^y without using “^”
        System.out.println("Enter the base number ");
        x = input.nextInt();
        result = x;
        System.out.println("Enter the power number ");
        y = input.nextInt();
        System.out.printf("%d^%d is ",x,y);
        for (int i = 0; i < y-1; i++) {
            result *= x;

        }
        System.out.println(result);
        //Input number till you will get negative number for each
        // positive number show sum of its digits
        do {
            System.out.println("Please enter natural number");
            natural = input.nextInt();
            while(natural != 0){
                temp += natural%10;
                natural /=natural;
            }
            System.out.println("The sum digits of the number is "+ temp);

        }while(natural < 0);
        //input number till you will get prime number
        //Print all not prime numbers

        do {
            flag = 0;
            System.out.println("Please enter a prime number");
            natural = input.nextInt();
            for (int i = 2; i <=  Math.sqrt(natural)  ; i++) {
                if (natural % i == 0 ) {
                    flag = 1;
                }
            }

            if (flag == 1) {

                System.out.println("The number is not prime try again... ");
            }
            if (flag == 0) {

                System.out.println("congratulate the number is  prime");
            }


        }while(flag == 1);

        System.out.println("Please enter a numbers of rows");
        x = input.nextInt();
        System.out.println("Please enter a numbers of col");
        y = input.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 ||i == x-1 ||j == 0 ||j == y-1 ) {
                    System.out.print("*");
                }
                else{
                    System.out.print("`");
                }
            }
            System.out.println();
        }

     //Create array of integers 1,2,3,4,5
        int [] integers = {1, 2, 3, 4, 5};
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        System.out.printf("The sum numbers in the array is %d",sum);
        System.out.println();

    // Calculate the Average of Elements in an Array.{7, 15, 3, 22, 10, 9, 14, 6};
        int [] elem = {7, 15, 3, 22, 10, 9, 14, 6};
        for (int i = 0; i < elem.length; i++) {
            ave += elem[i];
        }
        System.out.printf("The average of the elements in the array is %1.2",ave);
        //Find the Longest String in an Array {"apple", "banana", "cherry", "date", "fig"}
        //Write a Java program to find and print the longest string in an array of strings.
        String [] longest = {"apple", "banana", "cherry", "date", "fig"};
        for (int i = 0; i < longest.length; i++) {
            if(longest[i].length() > index){
                str = longest[i];
            }
        }
        System.out.printf("The longest element in the array is %s", str);


    //Find the Minimum Element in an Array {7, 15, 3, 22, 10, 9, 14, 6} using for each loop.
        int [] min = {7, 15, 3, 22, 10, 9, 14, 6};
        index = min[0];
        for (int i: min) {
            if (i < index) {
                index = i;
            }
        }
        System.out.println("The minimal number in the array is "+index);
        */

       // Write a Java program to create a two-dimensional array of
        // integers and calculate the sum of all the elements in the array.
        System.out.println("Please enter the numbers of the rows & column");
        x = input.nextInt();
        int [][] dime = new int [x][x];
        System.out.println("Enter "+ x +"numbers in the matrix");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("( "+i+","+j+" ) = " );
                dime[i][j] = input.nextInt();

            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j == i) {
                    sum += dime[i][j];
                    System.out.println("sum = "+sum+", dime ["+i+"]"+"["+i+"] ="+dime[i][i]);

                }

            }
        }


    }
}



