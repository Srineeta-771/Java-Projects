import java.util.Scanner;

public class PerfectNumber
{
    public static boolean isPerfectNumber(int number)
    {
        if(number<1)
            return false;
        else
        {
            int sum=0, i;
            for(i=1; i<number;i++)
                if((number%i)==0)
                    sum+=i;
            if(sum==number)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println(isPerfectNumber(num));
        scanner.close();
    }
}
