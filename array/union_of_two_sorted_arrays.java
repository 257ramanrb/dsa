    /*
        Ques: Union of two sorted arrays can be defined as the common and distinct elements in the two arrays.
              Given two sorted arrays of size N and M respectively, find their union.
        Link: https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
        Hint: Modify merge() of merge sort for the same.
    */
    private static void merge(int[] a, int[] b, int n, int m, ArrayList<Integer> ans)
    {
        int i = 0, j = 0;
        
        while(i < n && j < m)
        {
            if(a[i] < b[j])
            {
                ans.add(a[i]);
                i++;
                while(i < n && a[i] == a[i-1])
                {
                    i++;
                }
            }
            
            else if(a[i] > b[j])
            {
                ans.add(b[j]);
                j++;
                while(j < m && b[j] == b[j-1])
                {
                    j++;
                }
            }
            else
            {
                ans.add(a[i]);
                i++;
                while(i < n && a[i] == a[i-1])
                {
                    i++;
                }
                
                j++;
                while(j < m && b[j] == b[j-1])
                {
                    j++;
                }
            }
        }
        
        while(i < n)
        {
            ans.add(a[i]);
            i++;
            while(i < n && a[i] == a[i-1])
            {
                i++;
            }
        }
        
        while(j < m)
        {
            ans.add(b[j]);
            j++;
            while(j < m && b[j] == b[j-1])
            {
                j++;
            }
        }
    }
    
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        merge(arr1, arr2, n, m, ans);
        return ans;
    }
