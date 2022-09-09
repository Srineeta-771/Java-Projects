public class LastDigitChecker
{
    public static boolean hasSameLastDigit(int num1, int num2, int num3)
    {
        if((num1<10) || (num1>1000) || (num2<10) || (num2>1000) || (num3<10) || (num3>1000))
            return false;
        else
        {
            int remainder;
            while(num1>0 && num2>0 && num3>0)
            {
                remainder = num1%10;
                if (remainder==(num2%10) || remainder==(num3%10))
                    return true;
                num1 = num1/10;
            }
        }
        return false;
    }

    public static boolean isValid(int num)
    {
        if((num<10) || (num>1000))
            return false;
        else
            return true;
    }
    public static void main(String[] args)
    {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(-41,22,71));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(9));
        System.out.println(isValid(88));
    }
}
