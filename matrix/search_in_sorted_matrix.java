    /*
        Ques: Search a value in an m x n matrix. This matrix has the following properties: 1. Integers in each row are sorted from left to right. 2.The first integer of each row is greater than the last integer of the previous row.
        Link: https://leetcode.com/problems/search-a-2d-matrix/
        Hint: Binary Search
    */
    
    // Brute Force
    // Time: O(n*m)
    public boolean searchMatrixBruteForce(int[][] mat, int X) {
        for(int i = 0; i < mat.length; i++)
            for(int j = 0; j < mat[0].length; j++)
                if(mat[i][j] == X)
                    return true;
        return false;
    }
    
    // Better than Brute Force
    // Time: O(m+n)
    public boolean searchMatrix(int[][] mat, int X) {
        if(mat.length == 0 || mat[0].length == 0)
            return false;
        int n = mat.length, m = mat[0].length;
        for(int i = 0; i < n; i++)
        {
            if(X <= mat[i][m-1])
            {
                for(int j = m-1; j >= 0; j--)
                    if(mat[i][j] == X)
                        return true;
                
                return false;
            }
        }
        return false;
    }
    
    // Binary Search
    // Time: O(log(n*m))
    public boolean searchMatrixBS(int[][] mat, int X) {
        if(mat.length == 0)
            return false;
        int n = mat.length, m = mat[0].length;
        int low = 0, high = n*m - 1, i = 0, j = 0;
        
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            i = mid/m;
            j = mid%m;
            
            if(mat[i][j] == X)
                return true;
            if(mat[i][j] < X)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
