    /*
        Ques: Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 
        Link: https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1#
        Hint: Use transpose of matrix: row becomes columns, columns becomes rows. Then, swap column elems around mid elem (Reverse each column). Time: O(n^2), Space: O(1)
    */
    static void rotateby90(int mat[][], int n) 
    { 
        // Transpose the matrix: row becomes columns, columns becomes row
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                int tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }
        
        // swap each column elems around mid elem of that column (Reverse each column).
        for(int j = 0; j < n; j++)
        {
            for(int i = 0; i < n/2; i++)
            {
                int tmp = mat[i][j];
                mat[i][j] = mat[n-i-1][j];
                mat[n-i-1][j] = tmp;
            }
        }
    }
