import java.util.HashSet;
import java.util.Set;
 
public class Main
{
    public static void main(String args[]) 
    {
        int number  = 1111111;
        int sum = 0;
        Set<Integer> numbers = new HashSet<Integer>();
        while(numbers.add(number)){     
            sum = 0;
            while(number>0) {
                sum += (number % 10)*(number % 10); 
                number /=10;
            }
            number = sum;
        }
 
        // if sum = 1, it is happy number 
        if(sum == 1) {
            System.out.println("It is a happy number");
        }else {
            System.out.println("It is not a happy number");
        }
    }
}
 
