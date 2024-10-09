package lv.rvt; // atrašanās vieta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Give a number:");
        String input = scanner.nextLine();
        int number = Integer.valueOf(input);

        if (number < 0) {
            System.out.println("Unsuitable number");
        } else if (number == 0) {
            break;
        } else if (number > 0) {
            System.out.println(number * number);
        }
    }
}
}