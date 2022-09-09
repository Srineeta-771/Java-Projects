public class NumberPalindrome
{
    public static boolean isPalindrome(int number)
    {
        int reverse = 0,remainder,original;
        original = number;
        while(number != 0)
        {
            remainder = number%10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if(original == reverse)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1232));
        System.out.println(isPalindrome(-222));
    }
}
