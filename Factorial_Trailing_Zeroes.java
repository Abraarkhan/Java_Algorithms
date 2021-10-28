public class FactorialTrailingZeroMain {
 
    public static void main(String[] args)
    {
        FactorialTrailingZeroMain ftzm=new FactorialTrailingZeroMain();
        int countFactorialTrailingZeros = ftzm.countFactorialTrailingZeros(29);
 
        System.out.println("Factorial trailing zeroes for 29: "+countFactorialTrailingZeros);
    }
 
    public int countFactorialTrailingZeros(int num)
    {
        int countOfZeros=0;
        for(int i=2;i<=num;i++)
        {
            countOfZeros+=countFactorsOf5(i);
        }
        return countOfZeros;
    }
 
    private int countFactorsOf5(int i)
    {
        int count=0;
        while(i%5==0)
        {
            count++;
            i/=5;
        }
        return count;
    }
}
