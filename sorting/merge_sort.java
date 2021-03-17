class Solution
{
    /*
        Ques: Given an unsorted array, its starting position as start and its ending position as end. Use merge sort to sort arr[] in increasing order.
        Link: https://practice.geeksforgeeks.org/problems/merge-sort/1
    */
    void mergeSort(int arr[], int start, int end)
    {
         if(start < end)
         {
             int mid = start + (end-start)/2;
             mergeSort(arr, start, mid);
             mergeSort(arr, mid+1, end);
             merge(arr, start, mid, end);
         }
    }
  
    void merge(int arr[], int start, int mid, int end)
    {
        int u = start, v = mid+1, k = 0;
        int[] tmp = new int[end-start+1];
        
        while(u <= mid && v <= end)
        {
            if(arr[u] <= arr[v])
                tmp[k++] = arr[u++];
            else
                tmp[k++] = arr[v++];
        }
        
        while(u <= mid)
        {
            tmp[k++] = arr[u++];
        }
        
        while(v <= end)
        {
            tmp[k++] = arr[v++];
        }
        
        for(int i = start; i <= end; i++)
        {
            arr[i] = tmp[i-start];
        }
    }
}
