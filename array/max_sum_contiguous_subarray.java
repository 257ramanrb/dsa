/*
        Ques: Given an array arr of N integers. Find the contiguous sub-array maximum sum.
        Link: https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
        Hint: Kadane's algo
    */
    int maxSubarraySum(int arr[], int n){
        
        int max = arr[0];
        
        for(int i = 1; i < n; i++)
        {
            if(arr[i] < arr[i] + arr[i-1])
            {
                arr[i] += arr[i-1]; 
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }
