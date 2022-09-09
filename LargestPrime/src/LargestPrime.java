public class LargestPrime
{
    public static int getLargestPrime(int number)
    {
        if(number<=1)
            return -1;
        else
        {
            while(number>0)
            {
                int count;
                for(count=2;count<number;count++)
                {
                    if((number%count)==0)
                    {
                        number /= count;
                        count--;
                    }
                }
                return count;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(-9));
        System.out.println(getLargestPrime(45));
    }
}
