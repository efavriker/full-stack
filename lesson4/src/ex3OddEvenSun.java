import java.util.Scanner;

public class ex3OddEvenSun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum = 0;
        do {
            System.out.println("Please enter your number");
            num = input.nextInt();
            if(num%2 == 0 ){
                continue;
            }
            else{
                sum += num;
            }
        }while(num >0 || sum >1000);
    }
}
