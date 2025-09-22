import java.util.Scanner;
public class LeapYear {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Please Enter a Year to check");
         int year=input.nextInt();
         Checker(year);

    }
    public static void Checker(int year){
         if((year%4==0)&&((year%400)!=0 || year%100==0))
         {
             System.out.println("This year is a leap year");
         }
         else
         {
             System.out.println("this year is not a leap year");
         }
    }
}
