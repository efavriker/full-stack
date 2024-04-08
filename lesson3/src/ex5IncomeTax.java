import java.util.Scanner;

public class ex5IncomeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary,tax= 0;
        String name;
        System.out.println("Please enter your name");
        name = input.nextLine();
        System.out.println("Please enter your salary");
        salary = input.nextDouble();
        if (salary >= 23000) {
            tax += 23000 * 0.1;
            salary -= 23000;
            if (salary > 23000) {
                tax += 23000 * 0.2;
                salary -= 23000;
                if (salary > 74000) {
                    tax += 74000 * 0.3;
                    salary -= 74000;
                    if (salary > 100000) {
                        tax += 23000 * 0.4;
                        salary -= 100000;
                        if (salary != 0) {
                            tax += salary * 0.5;
                        }
                    }
                }
            }
        }
        System.out.printf("%s your tax is %1.2f",name,tax);

    }
}
