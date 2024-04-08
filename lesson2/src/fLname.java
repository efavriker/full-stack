import java.util.Scanner;

public class fLname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,fname,lname;;
        int index;

        System.out.println("Please enter your name");
        name = input.nextLine();
        index = name.indexOf(" ");
        fname = name.substring(0,index);
        lname = name.substring(index+1);
        System.out.println(lname.toUpperCase()+", "+fname.toUpperCase());


    }
}
