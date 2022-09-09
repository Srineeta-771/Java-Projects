public class FactorPrinter
{
    public static void printFactors(int num)
    {
        if(num>=1)
        {
            int i;
            for(i=1; i<=num; i++)
                if((num%i) == 0)
                    System.out.println(i);
        }
        else
            System.out.println("Invalid Value");
    }

    public static void main(String[] args)
    {
        printFactors(12);
        printFactors(-12);
    }
}
