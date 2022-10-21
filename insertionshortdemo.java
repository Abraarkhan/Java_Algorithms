package shorting;

public class insertionshortdemo {

	public void insertionshort(int A[] , int n) {
		for(int i = 1; i<n;i++)
		{
			int temp =A[i];
			int position =i;
			while(position>0 && A[position-1] > temp)
			{
				A[position] = A[position -1];
				position =  position - 1;


			}
			A[position] = temp;
		}

	}

	public void display(int A[] , int n)
	{
		for (int i = 0; i<n;i++)
			System.out.print(A[i] + " ");

		System.out.println();
	}
	public static void main (String[ ] args ) {

		insertionshortdemo  s = new insertionshortdemo();

		int A[] = {23,242,42,34,3,1};
		System.out.println("original array");
		s.display(A,6);
		s.insertionshort(A,6);
		System.out.println("shorted array ");
		s.display(A, 6);

	}

}

