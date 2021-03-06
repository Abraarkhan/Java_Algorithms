public class MaxVowelsSubstring
{
  static int maxVowelsInSubstring(String s,int k)
  {
      int n = s.length();
      int maxVowels = 0;
      // we iterate till n-k th position of the string 
      for(int i = 0;i < n - k ;i++)
      {
        // We generate the substring of length k using substring().  
        String sub_s = s.substring(i,i+k);
        //then count the vowels in the substring
        int vowels = countVowelsInSubstring(sub_s);
        // update maxVowels if current vowels is greater.
        maxVowels = Math.max(maxVowels,vowels);
 
      }
 
      return maxVowels;
  }
 
  static int countVowelsInSubstring(String s)
  {
      int countVowels = 0;
      for(int i=0; i<s.length();i++)
      {
          //get current char
          char ch = s.charAt(i);
          // check if it is a vowel and increment count.              
          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
          countVowels++;
      }
      return countVowels;
  }
 
  public static void main(String args[])
  {
      String str = "java2blog";
      int k = 3;
      int result = maxVowelsInSubstring(str,k);
 
      System.out.println("The Maximum Vowels present in the Substring of size "+k+" is : "+result);
  }
 
}
