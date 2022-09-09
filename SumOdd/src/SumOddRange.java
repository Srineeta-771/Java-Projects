public class SumOddRange
{
    public static boolean isOdd(int number)
    {
        if(number<0)
            return false;
        else
        {
            if((number%2)!=0)
                return true;
            else
                return false;
        }
    }
    public static int sumOdd(int start, int end)
    {
        int sum=0;
        if((end<start) || (start<0) || (end<0))
            return -1;
        else
        {
            for (start = start; start <= end; start++)
            {
                if (isOdd(start))
                    sum += start;
            }
            return sum;
        }
    }

    public static void main(String[] args)
    {
        //System.out.println(isOdd(-7));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
}
