import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
  public static void main(String[] args)
  {
      Scanner input= new Scanner(System.in);
      Random r=new Random();
      int target=r.nextInt(100)+1;
      int guess;
      do {
          System.out.println("Guess the number from 1 to 100");
          guess= input.nextInt();
          if(guess>target)
          {
              System.out.println("The number is less than your guess");
          }
          else if(guess<target)
          {
              System.out.println("The number is greater than your guess");
          }
          else
          {
              System.out.println("Congratulations!You have guessed it right.");
              break;
          }

      }
      while(guess!=target);
  }
}
