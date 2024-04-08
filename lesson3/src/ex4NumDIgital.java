import java.util.Scanner;

public class ex4NumDIgital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,counter = 0;
        System.out.println("Please enter your number ");
        num = input.nextInt();
        while(num != 0){
            num /= 10;
            counter++;
        }
        System.out.printf("The number if digits your number have is %d ", counter);
    }
}
