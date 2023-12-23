//Median of 2 Sorted Arrays of Different Sizes

//Time Complexity: O(min(log n, log m))
// Space: O((n+m)/2)

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
       
        int index1 = 0;
    int index2 = 0;
    int med1 = 0;
    int med2 = 0;
    for (int i = 0; i <= (m+n)/2; i++) {
        med1 = med2;
        if (index1 == n) {
            med2 = b[index2];
            index2++;
        } else if (index2 == m) {
            med2 = a[index1];
            index1++;
        } else if (a[index1] < b[index2] ) {
            med2 = a[index1];
            index1++;
        }  else {
            med2 = b[index2];
            index2++;
        }
    }

    // the median is the average of two numbers
    if ((n+m)%2 == 0) {
        return (float)(med1 + med2)/2;
    }

    return med2;
    }
        
}