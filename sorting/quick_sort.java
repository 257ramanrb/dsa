class Solution
{
    /*
        Ques: Given an unsorted array of size N, use quick sort to sort arr[] in increasing order.
        Link: https://practice.geeksforgeeks.org/problems/selection-sort/1 (Try all sorts in this ques only)
    */
    static void quickSort(int arr[], int start, int end)
    {
        if(start < end)
        {
            int p = partition(arr, start, end);
            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
    }
	
    static int partition(int arr[], int start, int end)
    {
        int i = start, j = end, pivot = start;

        while(i < j)
        {
            while(i < end && arr[i] <= arr[pivot])
            {
                i++;
            }

            while(arr[j] > arr[pivot])
            {
                j--;
            }

            if(i < j)
            {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = tmp;

        return j;
    }
}
