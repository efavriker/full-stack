import java.util.Scanner;

public class ex8muldiv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, times;
        System.out.println("Please enter a number");
        num = input.nextInt();
        int result = num;
        System.out.println("Please enter how many times");
        times = input.nextInt();
        for (int i = 0; i < times; i++) {
            result += num;
        }
        for (int i = 0; i < times; i++) {
            System.out.print(num + " + ");

        }
        System.out.printf(num + " = " + "%d * %d = %d", num, times, result);
        System.out.println();

      do {
          System.out.println("Please enter a number");
          num = input.nextInt();
          result = num;
          System.out.println("Please enter how many times");
          times = input.nextInt();
      }while (num % times !=0 );

       int counter = 0,temp = num;
        while(temp != 0) {
            counter ++;
            temp -=times;
        }
        System.out.print(num+" - ");
        for (int i = 0; i < counter-1; i++) {
            System.out.print(times + " - ");

        }
        System.out.printf(times + " = " + "%d / %d = %d", num, times, counter);

    }
}
