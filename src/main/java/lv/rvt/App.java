package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

    Scanner scanner = new Scanner(System.in);

    int numberSum = 0;
    int numberOfNumbers = 0;

    while (true) {
        System.out.println("Give a number:");
        String input = scanner.nextLine();
        int number = Integer.valueOf(input);

        if (number > 0 || number < 0) {
            numberSum += number;
            numberOfNumbers += 1;
        } else if (number == 0) {
            break;
        }
    }

    System.out.println("Number of numbers: " + numberOfNumbers);
    System.out.println("Sum of the numbers: " + numberSum);
    
    scanner.close();
    }
}