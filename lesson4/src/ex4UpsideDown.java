import java.util.Scanner;

public class ex4UpsideDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp = 0;
        System.out.println("Please enter number that u wanna to upside down");
        num = input.nextInt();
        while (num != 0){
            temp = (temp*10)+(num%10);
            num /=10;

        }
        System.out.println(temp);
    }
}
