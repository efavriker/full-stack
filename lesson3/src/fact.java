import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,fac =1;
        System.out.println("Please enter a number");
        num = input.nextInt();
        while (num >0){
            fac *= num;
            num--;
        }
        System.out.println(fac);
    }
}
