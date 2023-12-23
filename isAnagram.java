//isAnagram

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
    //T.C: O(N * logN)
 //S.C: O(1)
        
          char c[]=a.toCharArray();
        char c1[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if(a.length()==b.length()) {
            if(Arrays.equals(c, c1)){
                return true;
            }
            else{
                    return false;
                }
            
        }else {
            return false;
           }
    } 
}