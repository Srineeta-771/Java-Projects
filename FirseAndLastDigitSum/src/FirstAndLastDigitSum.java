public class FirstAndLastDigitSum
{
    public static int sumFirstAndLastDigit(int number)
    {
        int lastDigit, reverse = 0, remainder, firstDigit, sum =0;
        if(number >= 0)
        {
            lastDigit = number % 10;
            while (number > 0)
            {
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            firstDigit = reverse % 10;
            sum = lastDigit + firstDigit;
            return sum;
        }
        else
             return -1;
    }

    public static void main(String[] args)
    {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(-252));
        System.out.println(sumFirstAndLastDigit(0));
    }
}
