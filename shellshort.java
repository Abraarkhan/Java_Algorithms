package shorting;

public class shellshort {
	public void shellsort(int A[], int n) {
		int gap = n / 2;
		while(gap > 0) {
			int i = gap;
			while(i < n) {
				int temp = A[i];
				int j = i - gap;
				while(j>=0 && A[j]>temp) {
					A[j+gap] = A[j];
					j = j - gap;
				}
				A[j+gap] = temp;
				i = i + 1;
			}
			gap = gap / 2;
		}
	}

	public void display(int A[], int n) {
		for(int i=0;i<n;i++)
			System.out.print(A[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		shellshort s = new shellshort();
		int A[] = {3, 5, 8, 9, 6, 2};
		System.out.println("Original Array: ");
		s.display(A, 6);
		s.shellsort(A, 6);
		System.out.println("Sorted Array: ");
		s.display(A, 6);
	}


}
