public class triplet
{
    //Check if give numbers are pythagorean triplet or not

    //body
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        if(a==b && b==c)
        {
            System.out.println(a + " , " + b + " and " + c + " are not pythagorean triplet");
        }
        else
        {
            if(check(a,b,c))
            {
                System.out.println(a + " , " + b + " and " + c + " are pythagorean triplet");
            }
            else
            {
                System.out.println(a + " , " + b + " and " + c + " are not pythagorean triplet");
            }
        }
    }



    //function
    static boolean check(int a , int b , int c )
    {
        int l = larg(a,b,c);
        if(l == a)
        {
            return l*l == (b*b)+(c*c);
        }
        else if(l == b )
        {
            return l*l == (a*a)+(c*c);
        }
        else
        {
            return l*l == (a*a)+(b*b);
        }
    }





    //function to find the largest
    static int larg(int a,int b ,int c)
    {
        int x = Math.max(a,b);
        x = Math.max(x,c);
        return x;
    }
}