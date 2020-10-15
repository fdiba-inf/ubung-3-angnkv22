package exercise3;

import java.util.Scanner;

public class NumberCounter {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int count = 0;
  int sum = 0;
  int number = input.nextInt ();
  do {
            System.out.println("Enter a number: ");
            a = input.nextInt();
            b = input.nextInt();
            boolean positive = (a > 0);
            System.out.println("Positive number: " + positive);
            boolean negative = (b)
  while (number != 0) {
  count++;
  sum = sum + number;
  number = input.nextInt();
  }
        System.out.println("Count: " + count );
        System.out.println("Sum: " + sum );
    }

}
