package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

    Scanner scanner = new Scanner(System.in);

    int numberSum = 0;
    int numberAmount = 0;
    int evenNumbers = 0;
    int oddNumbers = 0;


    while (true) {
        System.out.println("Write numbers:");
        String stringInput = scanner.nextLine();
        int userInput = Integer.valueOf(stringInput);
       
        if (userInput == -1) {
            System.out.println("Thx! Bye!");
            break;
        } else {
            numberSum += userInput;
            numberAmount++;
        } if (userInput % 2 == 0) {
            evenNumbers++;
        } if (!(userInput % 2 == 0)) {
            oddNumbers++;
        }
    }

    System.out.println("Sum: " + numberSum);
    System.out.println("Numbers:" + numberAmount);
    System.out.println("Average: " + (Double.valueOf(numberSum) / numberAmount));
    System.out.println("Even: " + evenNumbers);
    System.out.println("Odd: " + oddNumbers);
    }
}