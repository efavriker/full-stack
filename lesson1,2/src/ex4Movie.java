import java.util.Scanner;

public class ex4Movie {
    public static void main(String[] args) {
        int mov,hou,min;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the movie");
        mov = input.nextInt();
        hou = mov/60;
        min =mov% 60;
        System.out.printf("the length of the movie is %d it's mean %d hour(s) and %d minute(s)",mov,hou,min);
    }
}
