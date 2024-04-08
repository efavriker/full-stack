import java.util.Scanner;

public class numberDe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,add;
        System.out.println("Please enter a number");
        num = input.nextInt();
        add = num < 0 ? 1:-1;
        while (num > 0){
            System.out.println(num);
            num += add;
        }
    }
}