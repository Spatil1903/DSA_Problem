//Look and Say Pattern

class Solution{
    static String lookandsay(int n) {
      
      if(n==1) return "1";
      String  s=lookandsay(n-1);
      StringBuilder result =new  StringBuilder();
      
      int counter=0;
      
      for(int i=0;i<s.length();i++){
          counter++;
          if(i==s.length()-1  || s.charAt(i)!=s.charAt(i+1)){
             result.append(counter).append(s.charAt(i));
             counter=0;
             
          }
      }
      return result.toString();
      
    }
}
