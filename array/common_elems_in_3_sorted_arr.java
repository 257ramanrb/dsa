    /*
        Ques: Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
        Link: https://practice.geeksforgeeks.org/problems/common-elements1132/1
        Hint: Use i = 0, j = 0, k = 0 for respective arr and in O(n1 + n2 + n3) time with O(1) space, it can be done.
    */
    private int findMax(int a, int b, int c)
    {
        if(a >= b && a >= c)
            return a;
        if(b >= a && b >= c)
            return b;
        return c;
    }
    
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i = 0, j = 0, k = 0;
        
        ArrayList<Integer>  ans = new ArrayList<>();
        
        while(i < n1 && j < n2 && k < n3)
        {
            if(A[i] == B[j] && A[i] == C[k])
            {
                ans.add(A[i]);
                i++;
                j++;
                k++;
                
                while(i < n1 && A[i] == A[i-1])
                {
                    i++;
                }
                
                while(j < n2 && B[j] == B[j-1])
                {
                    j++;
                }
                
                while(k < n3 && C[k] == C[k-1])
                {
                    k++;
                }
            }
            else
            {
                int max = findMax(A[i], B[j], C[k]);
                if(A[i] != max)
                {
                    i++;
                    while(i < n1 && A[i] == A[i-1])
                    {
                        i++;
                    }
                }
                if(B[j] != max)
                {
                    j++;
                    while(j < n2 && B[j] == B[j-1])
                    {
                        j++;
                    }
                }
                if(C[k] != max)
                {
                    k++;
                    while(k < n3 && C[k] == C[k-1])
                    {
                        k++;
                    }
                }
            }
        }
        return ans;
    }
