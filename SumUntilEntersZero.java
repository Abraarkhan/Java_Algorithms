public class Sumunitluserenters0 {
    public static void main(String[] args) {
        //Take integer inputs till user enters 0 and print the sum of all numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:-");
        int n=0 ;
        while(true){
            int a = in.nextInt();
            if (a!=0){
                n=n+a;
            }
            else{
                break;
            }
        }
        System.out.println("The sum of given numbers is " + n);
    }
}