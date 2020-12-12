    /*
        Ques: Find the intersection of two sorted arrays. OR in other words, Given 2 sorted arrays, find all the elements which occur in both the arrays.
        Link: https://www.interviewbit.com/problems/intersection-of-sorted-arrays/#
        Hint: Use logic of merge() of merge sort.
    */
    
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = 0, j = 0, n = A.size(), m = B.size();
        
        while(i < n && j < m)
        {
            if(A.get(i).equals(B.get(j)))
            {
                ans.add(A.get(i));
                i++;
                j++;
            }
            else if(A.get(i) < B.get(j))
            {
                i++;
            }else
                j++;
        }
        return ans;
    }
