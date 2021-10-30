class ModularExp
{
 
  static int power(int x, int y, int p)
  {
    int res = 1; 
 
    x = x % p; 
 
    if (x == 0)
      return 0; 
 
    while (y > 0)
    {
 
      
      if ((y & 1) != 0)
        res = (res * x) % p;

      y = y >> 1; // y = y/2
      x = (x * x) % p;
    }
    return res;
  }
 

  public static void main(String[] args)
  {
    int x = 75;
    int y = 5;
    int p = 13;
    System.out.print("Power is " + power(x, y, p));
  }
}
