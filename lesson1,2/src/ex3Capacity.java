import java.util.Scanner;

public class ex3Capacity {
    public static void main(String[] args) {
        double dep,capa;
        int diam;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the diameter of the pot ");
        diam = input.nextInt();
        System.out.println("Please enter the depth of the pot ");
        dep = input.nextDouble();
        capa = ((diam)^2)*(Math.PI)*dep;
        System.out.printf("The capacity of the pot is %2.2f", capa);
    }
}
