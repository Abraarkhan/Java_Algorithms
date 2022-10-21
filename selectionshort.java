package shorting;

public class selectionshort {



	public void selectionshorts(int A[], int n) {

		for (int i=0; i<n-1;i++) {

			int position = i;

			for (int j=i+1;j<n;j++ ) {
				if (A[j]<A[position])
					position =j;

				int temp = A[i];
				A[i] = A[position];
				A[position]= temp;
			}
		}

	}

	public void  display(int A[],int n) {
		for(int i = 0 ; i<n;i++ )


			System.out.print(A[i]+" ");
	System.out.println();  
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		selectionshort s =  new selectionshort();

		int A[] =  {3,15,7,9,5,8};
		
		System.out.print("original array:");
		s.display(A , 6);
		s.selectionshorts(A,6);
		System.out.print(" shorted array :");
		s.display(A, 6);
		
		
	}

}
