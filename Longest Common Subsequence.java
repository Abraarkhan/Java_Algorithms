Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.

Solution:

class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()][text2.length()];
        for(int i = 0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);    
        }
        
        return helper(text1,text2,0,0);
    }
    
    public int helper(String t1, String t2, int a, int b){
        if (a>=t1.length() || b>=t2.length()){
            return 0;
        }if (dp[a][b]>=0){
            return dp[a][b];
        }
        if (t1.charAt(a)==t2.charAt(b)){
            int temp = 1+helper(t1,t2,a+1,b+1);
            dp[a][b]=temp; return temp;
        }
        int t = Math.max(helper(t1,t2,a,b+1),helper(t1,t2,a+1,b));
        dp[a][b]=t; return t;
    }
    
}
