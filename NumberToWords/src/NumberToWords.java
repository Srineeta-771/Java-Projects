public class NumberToWords
{
    public static int getDigitCount(int number)
    {
        int count=0;
        if(number<0)
            return -1;
        else if(number==0)
            return 1;
        else
        {
            while(number!=0)
            {
                if(number%10>=0)
                    count++;
                number/=10;
            }
        }
        return count;
    }

    public static int reverse(int number)
    {
        int remainder, rev=0;
        while(number!=0)
        {
            remainder = number%10;
            rev = rev*10+remainder;
            number/=10;
        }
        number=rev;
        return number;
    }

    public static void numberToWords(int number)
    {
        if (number < 0)
            System.out.println("Invalid Value");
        int reversedNumber = reverse(number);
        int digitCountValue = getDigitCount(number);
        int reversedCountValue = getDigitCount(reverse(number));

        while (reversedNumber > 0)
        {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit)
            {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }
        if (digitCountValue == reversedCountValue)
        {
            if (number == 0)
                System.out.println("Zero");
        }
        else
        {
            for (int i = 1; i <= digitCountValue - reversedCountValue; i++)
                System.out.println("Zero");
        }
    }
    public static void main(String[] args)
    {
        System.out.println(getDigitCount(1234));
        System.out.println(getDigitCount(10));
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        numberToWords(10);
    }
}
