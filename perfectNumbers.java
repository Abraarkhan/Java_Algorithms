public class Perfectnumber {
    public static void main(String[] args) {
        //Perfect Number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int a = in.nextInt();
        int f;
        int s = 0;
        if(a==0){
            System.out.println("Invalid Input");
        }
        else{
            for(int i = 1; i<a ; i+=1){
                if(a%i==0){
                   f = i;
                   s += f;
                }else{
                    s = 0;
                }
            }
            if(s==a){
                System.out.println(a + "is a perfect number");
            }else if(s==0){
                System.out.println(a + " is not a perfect number");
            }
            else {
                System.out.println(a + " is a invalid number");
            }
        }
    }
}