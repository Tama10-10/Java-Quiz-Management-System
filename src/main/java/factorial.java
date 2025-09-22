
import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= input.nextInt();
        System.out.println(fact(n));

    }
    static int fact(int n)
    {
       if(n==1)
       {
           return 1;
       }
       else
       {
           return n*fact(n-1);
       }
    }
}
