    /*
        Ques: Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).
        Link: https://practice.geeksforgeeks.org/problems/middle-of-three2926/1
        Hint: Find middle of 3 elems => Better: compare 3 nums; Best: x = A - B; y = A - C; z = B - C; if(x*y < 0) A; if(y*z < 0) C; B;
    */
   
    // Better
    int middle(int A, int B, int C){
        if(B < A)
        {
            if(B > C)
                return B;
            if(C < A)
                return C;
            return A;
        }
        else
        {
            if(A > C)
                return A;
            if(B < C)
                return B;
            return C;   
        }
    }
    
    // Best
    int middle(int A, int B, int C){
    
        int x = A - B;
        int y = A - C;
        int z = B - C;
        
        if(x*y < 0)
            return A;
        if(y*z < 0)
            return C;
        return B;
    }
