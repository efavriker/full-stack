import java.util.Scanner;

public class stringSame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tex1,tex2;
        System.out.println("Pleade enter the first string");
        tex1 = input.nextLine();
        System.out.println("Pleade enter the second string");
        tex2 = input.nextLine();
        if (tex1.toLowerCase().equals(tex2.toLowerCase()))
        {
            System.out.println("The two of the strings are the same");
        }
        else {
            System.out.println("The strings are not the same");
        }

    }
}