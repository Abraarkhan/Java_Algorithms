import java.util.HashMap;
import java.util.Map;
 

// This is going to be a Fibonacci Example solved using the concept of memoization DP.


public class FibonacciMemoizationAlgorithm {
 
    private Map<Integer, Integer> memoizeTable = new HashMap<>(); // O(1)
 
    // Fibonacci with Memoization
    public int fibonacciMemoize(int n){
 
        if( n == 0 ) return 0;
        if( n == 1 ) return 1;
 
        if( this.memoizeTable.containsKey(n) ) 
        {
            System.out.println("Getting value from computed result for "+n);
            return this.memoizeTable.get(n);
        }
 
        int result = fibonacciMemoize(n-1)+ fibonacciMemoize(n-2);
 
        System.out.println("Putting result in cache for "+n);
        this.memoizeTable.put(n, result);
 
        return result;
 
    }
 
    // Fibonacci without Memoization
    public int fibonacci(int n){
 
        if( n == 0 ) return 0;
        if( n == 1 ) return 1;
 
        System.out.println("Calculating fibonacci number for: "+n);
        return (fibonacci(n-1) + fibonacci(n-2));   
    }
 
    public static void main(String[] args) {
 
        FibonacciMemoizationAlgorithm fibonacciAlgorithm = new FibonacciMemoizationAlgorithm();
        System.out.println("Fibonacci value for n=5:  "+fibonacciAlgorithm.fibonacciMemoize(5));
 
    }
}
