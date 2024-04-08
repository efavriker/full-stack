import java.util.Scanner;

public class ex3Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basic,power,result ;
        System.out.println("Please enter the basic number");
        basic = input.nextInt();
        result = basic;
        System.out.println("Please enter the power number");
        power = input.nextInt();

        for (int i = 0; i < power; i++){
            if (power == 0){
                result = 1;
            }
            result *= basic;
        }
        System.out.printf("The %d in power of %d is %d",basic,power,result);
    }
}
