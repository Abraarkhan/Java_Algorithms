class IterativeBinarySearch
{
	
	public static int binarySearch(int[] A, int x)
	{

       int low = 0, high = A.length - 1;


		while (low <= high)
		{
			

			int mid = (low + high) / 2;


			if (x == A[mid]) {
				return mid;
			}

			else if (x < A[mid]) {
				high = mid - 1;
			}

		
			else {
				low = mid + 1;
			}
		}


		return -1;
	}

	public static void main(String[] args)
	{
		int[] A = { 2, 5, 6, 8, 9, 10 };
		int key = 5;

		int index = binarySearch(A, key);

		if (index != -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found in the array");
		}
	}
}
