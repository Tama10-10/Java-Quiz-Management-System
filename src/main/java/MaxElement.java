import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args)
    {
        int[] array=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 elements for array");
        for(int i=0;i<5;i++)
        {
           array[i] =sc.nextInt();
        }

        System.out.println("The difference between maximum and Second maximum element= "+findDiff(array));

    }
    static int findDiff(int[] arr)
    {
        int max=0,smax=0;
        for(int i=0;i<5;i++)
        {
            if(max<arr[i])
            {   smax=max;
                max=arr[i];
            }
            else
            {
                if(smax<arr[i])
                {
                    smax=arr[i];
                }
            }
        }
        return max-smax;
    }
}
