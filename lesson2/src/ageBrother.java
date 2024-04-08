import java.util.Scanner;

public class ageBrother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b1,b2;
        System.out.println("Enter Tomer age");
        b1 = input.nextInt();
        System.out.println("Enter Dani age ");
        b2 = input.nextInt();
        if (b1 > b2){
            System.out.println("tomer is older then Dani");
        }
        else if(b2> b1){
            System.out.println("Dani is older then Tomer");
        }
        else {
            System.out.println("Tomer and Dani in the same age");
        }
    }
}
