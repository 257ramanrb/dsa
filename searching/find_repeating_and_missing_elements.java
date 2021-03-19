class Solution {
    
    /*
        Ques: Given an unsorted array Arr of size N of positive integers. 
              One number 'A' from set {1, 2, …N} is missing and one number 'B' 
              occurs twice in array. Find these two numbers.
        Link: https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
    */
    
    int[] findRepeatingAndMissingElement(int arr[], int n) {
        int[] ans = new int[2];
        
        for(int i = 0; i < n; i++)
        {
            if(arr[Math.abs(arr[i])-1] < 0)
                ans[0] = Math.abs(arr[i]);
            else
                arr[Math.abs(arr[i])-1] *= -1; 
        }
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > 0)
            {
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
}
