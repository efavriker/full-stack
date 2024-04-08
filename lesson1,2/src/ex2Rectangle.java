import java.util.Scanner;

public class ex2Rectangle {
    public static void main(String[] args) {
        double len,width,area,scope;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle ");
        len = input.nextDouble();
        System.out.println("Please enter the width of the rectangle ");
        width = input.nextDouble();
        area = len * width;
        scope = (2*len)+(2*width);
        System.out.printf("The area of the rectangle is %1.2f and it's scope is %1.2f",area,scope);
    }
}
