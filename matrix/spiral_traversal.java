 /*
    Ques: Given a matrix of size R*C. Traverse the matrix in spiral form.
    Link: https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
 */

 private static Scanner scan = new Scanner(System.in);
 public static void main (String[] args)
 {
    int t = scan.nextInt();

    while(t > 0)
    {
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = scan.nextInt();

        int top = 0, left = 0, right = n-1, bottom = m-1;
        int dir = 0; // 0 -> right, 1 -> down, 2 -> left, 3 -> up

        while(top <= bottom && left <= right)
        {
            if(dir == 0)
            {
                for(int i = left; i <= right; i++)
                    System.out.print(mat[top][i] + " ");
                dir = 1;
                top++;
            }else if(dir == 1)
            {
                for(int i = top; i <= bottom; i++)
                    System.out.print(mat[i][right] + " ");
                dir = 2;
                right--;
            }else if(dir == 2)
            {
                for(int i = right; i >= left; i--)
                    System.out.print(mat[bottom][i] + " ");
                dir = 3;
                bottom--;
            }else
            {
                for(int i = bottom; i >= top; i--)
                    System.out.print(mat[i][left] + " ");
                dir = 0;
                left++;
            }
        }
        System.out.println();
        t--;
    }
 }
