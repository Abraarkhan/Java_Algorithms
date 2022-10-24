import java.util.Scanner;

class Main{

	public static double area_of_triangle(double l, double b){
	    double area = 0;
 
      area = 0.5 * l * b ; 

	    return area;
	}

	public static void main(String args[]){

		double l,b;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the triangle: ");
		l = in.nextDouble();

		in = new Scanner(System.in);
		System.out.print("Enter the breadth of the triangle: ");
		b = in.nextDouble();
		
		System.out.println(area_of_triangle(l,b));
	}
}
