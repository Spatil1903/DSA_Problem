//Search an element in sorted and rotated array

//Time Complexity : O(log n)
//Space Complexity :O(1)


class Solution 
{ 
    static int Search(int array[], int target)
	{
	   
	   int low=0;
	    int high=array.length-1;
	    
	    //Modified binary Search
	    while(low<=high){
	       
	       int mid= (low+high)/2;
	       
	       if(array[mid]== target){
	           return mid;
	       }
	       
	       //Means left sub-array is Sorted;
	       if(array[low]<=array[mid]){
	           
	           //When target also lies in range low to mid-1
	           if(target>= array[low] && target< array[mid]){
	               //Perform binarySearch in this left-subArray next time
	               //set high
	               high= mid-1;
	           }
	           
	           //When target not lies in range low to mid-1
	           else{
	              //So, perform search in right-subArray next time
	              //set low
	              low= mid+1;
	           }
	           
	       }
	       //Means right sub-array is Sorted;
	       else{
	           
	           //When target also lies in range mid+1 to high
	           if(target>array[mid] && target<=array[high]){
	             //So, perform search in right-subArray next time
	             //set low
	             low= mid+1;
	           }
	           
	           //When target not lies in range mid+1 to high
	           else{
	              //Perform binarySearch in this left-subArray next time
	               //set high 
	               high= mid-1;
	           }
	       }
	    }
	    
	    
	    
	    return -1;
	 
	   
	}
} 

