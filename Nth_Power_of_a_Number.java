//Finding the Nth Power of a Number

import java.util.Scanner;  
public class PowerOfNumberExample1   
{  
//function to find the power of a number  
static int power(int b, int exp)  
{  
int power = 1;  
//increment the value of i after each iteration until the condition becomes false  
for (int i = 1; i <= exp; i++)   
//calculates power  
power = power * b;  
//returns power  
return power;  
}  
//driver code  
public static void main(String args[])  
{  
int b, exp;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the base: ");  
b=sc.nextInt();  
System.out.print("Enter the exponent: ");  
exp=sc.nextInt();  
//calling function  
int pow=power(b, exp);  
//prints the result  
System.out.println(b +" to the power " +exp + " is: "+pow);  
}  
}  