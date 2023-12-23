Search in a row-column sorted Matrix


//T.C: log(n*m)
//S.C: O(1)

class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	   
	  
	 int i = 0;     
    int j = m - 1;  
     
    while (i < n && j >= 0) {
        if (matrix[i][j] == x) {
            return true;
            
        } else if (matrix[i][j] > x) {
            j--;  
        } else {
            i++;  
        }
    }
    
    return false;
}
	
} 
