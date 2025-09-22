import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("enter three number");
        int x= input.nextInt();
        int y= input.nextInt();
        int z= input.nextInt();

        if(x>y)
        {
            if(x>z)
            {
                System.out.println("The largest number = "+x);

            }
            else
            {
                System.out.println("The largest number = "+z);
            }
        }
        else
        {
           if(y>z)
           {
               System.out.println("The largest number= "+y);
           }
           else
           {
               System.out.println("The largest number= "+z);
           }
        }
}}

