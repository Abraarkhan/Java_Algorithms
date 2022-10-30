class Solution {
	public int mySqrt(int x) {
		int start = 0;
		int end = x; 
		int mid = 0;

		if(x==0) return 0;
		if(x==1) return 1;

		while(start<=end){
			mid = start+(end-start)/2;

			if(mid==(x/mid)){
				return mid;

			}else if(mid>x/mid){

				end = mid-1;

			}else{
				if((mid+1) > x/(mid+1)){
					return mid;
				}
				start = mid+1;
			}
		}



		return mid;
	}
}