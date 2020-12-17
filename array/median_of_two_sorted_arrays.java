    /*
        Ques: Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
        Hint: https://www.youtube.com/watch?v=lLFDQCDzfpI
    */
    
    // Sort arr = a1 and a2
    // Time: O((n+m)log(n+m)); Space: O(1)
    public double findMedianSortedArraysSortArr(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] ans = new int[n+m];
        
        int k = 0;
        for(int i : nums1)
            ans[k++] = i;
        for(int i : nums2)
            ans[k++] = i;
        
        Arrays.sort(ans);
        
        double med = 0.0;
        if((n+m) % 2 == 0)
        {
            med = (ans[(n+m)/2 - 1] + ans[(n+m)/2])/2.0;
        }else
        {
            med = ans[(n+m)/2];
        }
        return med;
    }
    
    // merge() of merge sort
    // Time: O(n+m); Space: O(n+m)
    public double findMedianSortedArraysMergeSort(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] a = new int[n+m];
        
        while(i < n && j < m)
        {
            if(nums1[i] < nums2[j])
                a[k++] = nums1[i++];
            else
                a[k++] = nums2[j++];
        }
        while(i < n)
            a[k++] = nums1[i++];
        while(j < m)
            a[k++] = nums2[j++];
        
        double med = 0.0;
        
        if((n+m)%2 != 0)
            med = a[(n+m)/2];
        else
            med = (a[(n+m)/2-1] + a[(n+m)/2])/2.0;
        return med;
    }
    
    // Binary search
    // Time: O(log(n+m)); Space: O(1)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        
        int n = nums1.length, m = nums2.length, nm = n + m;
        
        int l = 0, h = n;
        
        while(l <= h)
        {
            int p1 = (l+h)/2;
            int p2 = (nm+1)/2 - p1;
            int l1 = getLeft(nums1, p1);
            int r1 = getRight(nums1, p1);
            int l2 = getLeft(nums2, p2);
            int r2 = getRight(nums2, p2);
            
            if(l1 <= r2 && l2 <= r1)
            {
                if(nm%2 == 0)
                    return (Math.min(r1, r2) + Math.max(l1, l2))/2.0;
                else
                    return (double)Math.max(l1, l2);
            }
            if(l1 > r2)
                h = p1-1;
            else
                l = p1+1;
        }
        return -1;
    }
    
    private int getLeft(int[] a, int p)
    {
        if(p==0)
            return Integer.MIN_VALUE;
        return a[p-1];
    }
    
    private int getRight(int[] a, int p)
    {
        if(p==a.length)
            return Integer.MAX_VALUE;
        return a[p];
    }
