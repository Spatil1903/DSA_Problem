//Spirally traversing a matrix


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int left=0;
        int right=c-1;
        int top=0;
        int bottom=r-1;
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(top<=bottom && left<=right)
        {
            for (int i=left;i<=right;i++)
            {
                arr.add(matrix[top][i]);
               
                
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom){
                
            for(int i=right;i>=left;i--){
                arr.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right){
            
            for(int i=bottom;i>=top;i--){
                arr.add(matrix[i][left]);
                
            }
            left++;
            }
            
        }
        return arr;
    }
}
