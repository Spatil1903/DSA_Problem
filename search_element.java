//Searching in an array where adjacent differ by at most k
class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
      
       
       /*
       this is not working solution 
       for(int i=0;i<n;i++){
           if(arr[i]==x)
           {
               if(arr[i]-arr[i-1]==k && arr[i+1]-arr[i]==k){
                   return i;
                   
               }
           }
       }
       return 0;
       */
       
       
         for(int i = 0; i < n; i++){
            
            if (x == arr[i]){
                
                return i;
            }
        }
        return -1;
        
    }
    
    
    
    
}





