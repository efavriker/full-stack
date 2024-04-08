import java.util.Scanner;

public class school {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int degree;
        degree = input.nextInt();
        if (degree < 55){
            System.out.println("not enough");
        }
        else if (degree >= 55 && degree < 64 ){
            System.out.println("enough");
        }
        else if (degree > 65 && degree < 74 ){
            System.out.println("almost good");
        }
        else if (degree > 75 && degree < 84 ){
            System.out.println(" good");
        }
        else if (degree > 85 && degree < 94 ){
            System.out.println(" very good");
        }
        else if (degree > 95 && degree < 100 ){
            System.out.println(" grate");
        }
    }
}
