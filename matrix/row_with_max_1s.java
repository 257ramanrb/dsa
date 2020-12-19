    /*
        Ques: Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.
        Link: https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1#
        Hint: 
            To solve in O(n+m) start from the top right corner of the matrix and keep track of the index of the row which has maximum 1s. 
            Go left if you encounter 1
            Go down if you encounter 0
            Stop when you reach the last row or first column. 
    */
    int rowWithMax1s(int arr[][], int n, int m) {
        int ans = -1, i = 0, j = m-1;
        
        while(i < n && j >= 0)
        {
            if(arr[i][j] == 1)
            {
                ans = i;
                j--;
            }else
            {
                i++;
            }
        }
        
        return ans;
    }
