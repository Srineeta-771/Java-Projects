public class GreatestCommonDivisor
{
    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first<10 || second<10)
            return -1;
        int GCD=0, num1,num2,i;
        num1 = (first < second)? first : second;
        num2 = (num1 == first)? second : first;
        for(i=num1; i>1 ;i--)
        {
            if((num1%i)==0 && (num2%i)==0)
            {
                GCD=i;
                break;
            }
        }
        return GCD;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }
}
