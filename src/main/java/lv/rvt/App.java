package lv.rvt; // atrašanās vieta

// import java.io.BufferedReader;
// import java.io.Console;
// import java.util.Scanner;

public class App 
{
  

  public static void printStripe(int length, String color) {
    System.out.print(color);
  for (int i = 0; i < length; i++) {
    System.out.print(" ");
  }
  System.out.print(ConsoleColors.RESET);
  System.out.println();
  }
  public static void main(String[] args) {
    printStripe(25, ConsoleColors.DARK_RED_BACKGROUND);
    printStripe(25, ConsoleColors.DARK_RED_BACKGROUND);
    printStripe(25, ConsoleColors.WHITE_BACKGROUND);
    printStripe(25, ConsoleColors.DARK_RED_BACKGROUND);
    printStripe(25, ConsoleColors.DARK_RED_BACKGROUND);
  }
  

}


