class Solution{
      
    int Countpair(int a[], int n, int sum)
    {
       
        int i=0,j=n-1,k=0,ans=0;
        while(i<j){
            k=a[i]+a[j];
            if(k==sum){
                ans++;
                i++;
                j--;
            }
            else if(k>sum){
                j--;
            }
            else{
                i++;
            }
        }
        if(ans==0) return -1;
        return ans;
    }
      
}