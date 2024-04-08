import java.util.Scanner;

public class ex4Guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cop, user;
        System.out.println("Please enter number between 1 to 100");
        user = input.nextInt();
        cop = (int)Math.random()*100+1;
        if (cop > user)
        {
            System.out.println("too low");
        } else if (cop < user)
        {
            System.out.println("too high");
        }
        else
        {
            System.out.println("BINGO!");
        }
    }
}
