import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter N:\t");
        int N = sc.nextInt();

        int[] inArr = new int[N];
        for(int i=0; i<N; i++)
        {
            inArr[i] = sc.nextInt();
        }

        
        subsets(inArr);

    }

    //  //print all subsets
    // private static void subsets(int[] inArr)
    // {
    //     int n = (int) Math.pow(2, inArr.length);

    //     for(int i=0; i<n; i++)
    //     {
    //         int[] oArr = new int[inArr.length];
    //         int j=i;
    //         int count=0;
    //         while(j!=0)
    //         {
    //             oArr[count] = j%2;
    //             j = j/2;
    //             count++;
    //         }

    //         for(int k=0; k<inArr.length; k++)
    //         {
    //             if(oArr[k]==1)
    //             {
    //                 System.out.print(inArr[k]+"\t");
    //             }
    //             else
    //             {
    //                 System.out.print("-\t");
    //             }
    //         }

    //         System.out.println("\n");
    //     }
    // }


      // //print all subsets
      private static void subsets(int[] inArr)
      {
          int n = (int) Math.pow(2, inArr.length);
        
          System.out.print("Null");
          for(int i=0; i<n; i++)
          {
              int j=i;
              int count=0;
              while(j!=0)
              {
                  if(j%2 !=0)
                  {
                    System.out.print(inArr[count]+"\t");
                  }
                  j = j/2;
                  count++;
              }
              System.out.println("\n");
  
          }
      }
  
     
}
