import java.util.Scanner;

public class EvenDigitSum
{
    public static int getEvenDigitSum(int number)
    {
        int remainder, sum = 0;
        if(number >= 0)
        {
            while(number > 0)
            {
                remainder = number % 10;
                if((remainder % 2) == 0)
                    sum += remainder;
                number = number /10;
            }
            return sum;
        }
        else
            return -1;
    }

    public static void main(String[] args)
    {
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(-123456789));
//        System.out.println(getEvenDigitSum(0));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(getEvenDigitSum(num));
        scanner.close();
    }
}
