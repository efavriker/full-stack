import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Please enter the high of the pyramid");
        num = input.nextInt();
        // no' 1
        for (int i = 1; i <= num; i++) {

            for (int j = 1 ; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //no' 2
        for (int i = 1; i <= num; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //no' 3
        for (int i = 1; i <= num; i++) {

            for (int j = 1 ; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //no' 4
        for (int i = 0; i < num; i++) {

            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        //no' 5
         for (int i = 0; i <= num; i++) {

             for (int j = 0; j < i; j++) {
                 System.out.print(" ");
             }
             for (int j = 0; j < num - i; j++) {
                 System.out.print("*");
             }

             System.out.println();
         }
        //no' 6
        for (int i = 0; i <= num; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num - i; j++) {
                System.out.print("* ");
            }

            System.out.println();


        }
    }
}
