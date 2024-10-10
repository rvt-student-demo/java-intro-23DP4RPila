package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    int number = Integer.valueOf(input);

    for (int i = number; i < 101; i++) {
        System.out.println(i);
        if (number == 100) {
            break;   
        }
    }
    scanner.close();
    }
}