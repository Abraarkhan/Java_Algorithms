// Java program to change elements 
// in a LinkedList 
    
import java.util.*; 
    
public class linkedlist_changeele { 
    
    public static void main(String args[]) 
    { 
        LinkedList<String> ll = new LinkedList<>(); 
    
        ll.add("Hello"); 
        ll.add("HacktoberFest"); 
        ll.add(2, "!!!"); 
    
        System.out.println("Initial LinkedList " + ll); 
    
        ll.set(1, "HacktoberFest2021"); 
    
        System.out.println("Updated LinkedList " + ll); 
    } 
} 

/* Output
Initial LinkedList [Hello, HacktoberFest, !!!]
Updated LinkedList [Hello, HacktoberFest2021, !!!]
*/
