import java.util.Scanner;

public class carSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed;
        System.out.println("Please enter your car speed");
        speed = input.nextInt();
        if (speed>120){
            System.out.println("Too fast");
        }
        else if (speed < 80) {
            System.out.println("Too solw");
        }
        else{
            System.out.println("Good driver");
        }
    }
}
