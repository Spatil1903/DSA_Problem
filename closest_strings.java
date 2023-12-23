class Solution {
   // Closest Strings
    
   // T.C: O(n2)
// S.C: O(n)
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
      
      
      int a=-1, b=-1;
      
      int ans=Integer .MAX_VALUE;
      
      for(int i=0;i<s.size();i++){
          
          if(s.get(i).equals(word1))
          a=i;
          
          if(s.get(i).equals(word2))
          b=i;
          
          if(a != -1 &&  b != -1)
          
          ans= Math.min(ans,Math.abs(b-a));
          
        }
      
      return ans;
      
    }
};