import java.util.Scanner;
public class sumUserInput {
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       int s=0;
       while(true)
       {
           int n= input.nextInt();
           if(n==-1)
           {
               System.out.println("Process Stopped");
               break;
           }
           else
           {
              s=s+n;
               System.out.println("The total = "+s);
           }
       }

    }
}
