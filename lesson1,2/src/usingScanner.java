import java.util.Scanner;

public class usingScanner {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String name, lastName;
        int age;
        System.out.println("please enter your name ");
        name = input.nextLine();
        System.out.println("please enter your last name ");
        lastName = input.next();
        System.out.println("please enter your age ");
        age = input.nextInt();
        System.out.printf("your name is %s and your last name is %s and your age is %d ",name,lastName, age);

    }
}
