package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        Double firstNumber = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number: ");
        Double secondNumber = Double.valueOf(scanner.nextLine());

        Double sumResult = firstNumber + secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sumResult);
        
        Double substractResult = firstNumber - secondNumber;

        System.out.println(firstNumber + " - " + secondNumber + " = " + substractResult);
        
        Double multiplyResult = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplyResult);
        
        Double divideResult = firstNumber / secondNumber;

        System.out.println(firstNumber + " / " + secondNumber + " = " + divideResult);
        

    }
}