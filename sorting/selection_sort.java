class Solution
{
    /*
        Ques: Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.
        Link: https://practice.geeksforgeeks.org/problems/selection-sort/1
    */
	void selectionSort(int arr[], int n)
	{
	    for(int i = 0; i < n-1; i++)
	    {
	        int min = arr[i];
	        int pos = i;
	        
	        for(int j = i+1; j < n; j++)
	        {
	            if(arr[j] < min)
	            {
	                min = arr[j];
	                pos = j;
	            }
	        }
	        
	        arr[pos] = arr[i];
	        arr[i] = min;
	    }
	}
}
