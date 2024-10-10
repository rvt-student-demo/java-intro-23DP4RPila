package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Write numbers:");


    int faktorials = 1;
    String stringInput = scanner.nextLine();
    int userInput = Integer.valueOf(stringInput);

    for (int i = 1; i <= userInput; i++) {
        faktorials = faktorials * i;

    }
    System.out.println(faktorials);
    
    }
}