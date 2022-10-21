class binexp 
{
  static int power( int N, int M)
    {
        int power = N, sum = 1;
        while(M > 0)
        {
            if((M & 1) == 1)
            {
                sum *= power;
            }
            power = power * power;
            M = M >> 1;
        }
        return sum;
    }
	public static void main (String[] args) 
	{
		int N = 25, M = 13;
		System.out.println(power(N, M));
	}
}
