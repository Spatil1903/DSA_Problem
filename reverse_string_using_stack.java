//Reverse a string using Stack


class Solution {
    
    // T.C: O(N)
// S.C: O(N)
    
    public String reverse(String S){
     
     Stack<Character> stack=new Stack<>();
     int index=0;
     
     while(index<S.length())
    {
        stack.push(S.charAt(index));
        index++;
        
    } 
    
    StringBuilder sb=new StringBuilder("");
    
       while(!stack.isEmpty())
      {
             char ch=stack.pop();
             sb.append(ch);
             
       }  
       
       return sb.toString();
       
        
    }

}