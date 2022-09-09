import java.util.Scanner;
public class Testarray
{
    void min(int arr[])
    {
        int min = arr[0];
        for (int i = 1; i <arr.length; i++)
        {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
    }
    public static void main(String args[])
    {
        //Scanner s = new Scanner(System.in);
        int i;
        int a[]=new int[] {4,2,8,6,10};
//        System.out.println("enter array elements");
//        for(i=0;i<5;i++)
//        {
//            a[i]= s.nextInt();
//        }
        Testarray b = new Testarray();
        b.min(a);
    }

}