package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

    Scanner scanner = new Scanner(System.in);

    System.out.println("How many times?: ");
    String stringInput = scanner.nextLine();
    int userInput = Integer.valueOf(stringInput);
    int times = 1;
    
    while (times <= userInput) {
        greetings();
        times++;   
    }
    }

    public static void greetings() {
        System.out.println("Labdien!");
    }
}