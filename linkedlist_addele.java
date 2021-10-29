// Java program to add elements 
// to a LinkedList
    
import java.util.*; 
    
public class GFG { 
    
    public static void main(String args[]) 
    { 
        LinkedList<String> ll = new LinkedList<>(); 
    
        ll.add("Hello"); 
        ll.add("Hacktoberfest"); 
        ll.add(1, "!!!"); 
    
        System.out.println(ll); 
    } 
} 
