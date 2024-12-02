package lesson8.hw7_8;

public class Memory {

    private static int number;
    private static float decimalNumber;
    private static String string;

    public static int add(int newNumber){
        return number += newNumber;
    }
    public static double add(float newDecimalNumber){
        return decimalNumber += newDecimalNumber;
    }
    public static String add(String newString){
        return string += newString;
    }


}
