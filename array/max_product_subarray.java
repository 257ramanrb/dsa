    /*
        Ques: Given an integer array, find the contiguous subarray within an array (containing at least one number) which has the largest product.
        Link: https://leetcode.com/problems/maximum-product-subarray/
        Hint: Kadane's algo, O(n) time and O(1) space, currMax, currMin, a[i]; edge case: 0 and neg numbers.
    */
    
    public int maxProduct(int[] arr) {
        int currMax = arr[0], currMin = arr[0], overallMax = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
            int tmpCurrMax = currMax;
            currMax = Math.max(arr[i], Math.max(currMax*arr[i], currMin*arr[i]));
            currMin = Math.min(arr[i], Math.min(tmpCurrMax*arr[i], currMin*arr[i]));
            
            if(currMax > overallMax)
                overallMax = currMax;
        }
        
        return overallMax;
    }
