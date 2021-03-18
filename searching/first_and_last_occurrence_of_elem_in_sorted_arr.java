class Solution
{
    /*
        Ques: Given a sorted array arr containing n elements with possibly duplicate elements, 
              the task is to find indexes of first and last occurrences of an element x in the given array.
        Link: https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
        Hint: Use binary search for time complexity of O(logN)
    */
    
    // Return first position and last position of specified element x in arr i.e. [firstPos, lastPos]
    ArrayList<Long> find(long arr[], long n, long x)
    {
        ArrayList<Long> ans = new ArrayList<>();
        ans.add(binarySearch(arr, 0, n-1, x, true));
        ans.add(binarySearch(arr, 0, n-1, x, false));
        return ans;
    }
    
    long binarySearch(long arr[], long start, long end, long x, boolean isFindFirstPos)
    {
        long ans = -1;
        while(start <= end)
        {
            long mid = start + (end - start)/2;
        
            if(arr[(int) mid] == x)
            {
                ans = mid;
                if(isFindFirstPos)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if(arr[(int) mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }
}
