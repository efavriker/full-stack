import java.util.Scanner;

public class ex1SumAve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ,sum = 0 ,count = 0;
        do {
            System.out.println("Please your number, if want to exit please enter enter 1 ");
            num = input.nextInt();
            if (num != 1){
                sum += num;
                count +=1;
            }
        }while (num != 1);
        System.out.println();
        System.out.printf("There is %d numbers the sum of your numbers is %d and the average is %d",count,sum,(sum/count));
    }
}