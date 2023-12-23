//A Boolean Matrix Question

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
      /* 
     // Approach 1:
     // Time Complexity: O((N*M)*(N + M)). O(N*M) 
     
 //Space:O(1)
 O(M + N)
      HashSet<Integer> set_i = new HashSet<>();//this will store elements in row
        HashSet<Integer> set_j = new HashSet<>();//th colis will store elements in col
        int row = matrix.length;
        
         int col = matrix[0].length;
         
         //this for loop is to add the elements  from in set  having  value 1
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1){
                    set_i.add(i);
                    set_j.add(j);
                }
            }
        }

//this for loop is to make values from rows and colums 1 which we have stored in set
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(set_i.contains(i) || set_j.contains(j)){
                    matrix[i][j] = 1;
                }
            }
        }
        */
        
        
        //approach 2 optimized:
      // T.C: O(M*N)
        //S.C: O(M + N)
       
        
        int row_s = matrix.length;
        
         int col_s = matrix[0].length;
         
         int row[] = new int[row_s];
        int col[] = new int[col_s];
        int i, j;
        
         for (i = 0; i <row_s; i++)
            row[i] = 0;
 
        
        for (i = 0; i < col_s; i++)
            col[i] = 0;
 
       
        for (i = 0; i < row_s; i++) {
            for (j = 0; j < col_s; j++) {
                if (matrix[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
 

        for (i = 0; i < row_s; i++){
            for (j = 0; j < col_s; j++){
                if (row[i] == 1 || col[j] == 1){
                    
                
                    matrix[i][j] = 1;
                }
            }
        }
    }
    
}


