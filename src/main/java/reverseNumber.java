import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();
        System.out.println(reverse(number));

    }
    static int reverse(int n)
    { int reversed=0;
        while(n!=0)
        {
           int r=n%10;
           reversed=reversed*10+r;
           n=n/10;
        }
        return reversed;
    }
}
