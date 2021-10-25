import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int array[] = {9, 5, 4, 3, 2, 1, 8, 7, 6};
		System.out.println("Array before sorting:\n"+Arrays.toString(array));
		
		for(int i = 0; i < array.length; i++){
			for(int j= 1; j < array.length; j++){
				if(array[j-1]> array[j]){
					swap(array, j-1, j);
				}
			}			
		}
		
		System.out.println("Array after sorting:\n"+Arrays.toString(array));
	}

	public static void swap(int array[],int i,int m){
		int t = array[i];
		array[i] = array[m];
		array[m] = t;
	}
}
