public class SharedDigit
{
    public static boolean hasSharedDigit(int num1, int num2)
    {
        int r1, r2, q1, q2;
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99))
            return false;
        else
        {
            r1 = num1 % 10;
            q1 = num1 / 10;
            r2 = num2 % 10;
            q2 = num2 / 10;
            if((r1 == q1)||(r1 == r2)||(r1==q2)||(r2==q2)||(r2==q1)||(q1==q2))
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(19,99));
        System.out.println(hasSharedDigit(12,13));
    }
}
