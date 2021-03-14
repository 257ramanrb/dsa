class Solution
{
    /*
        Ques: Given an unsorted array of size N, use bubble sort to sort arr[] in increasing order.
        Link: https://practice.geeksforgeeks.org/problems/selection-sort/1 (Try all sorts in this ques only)
    */
    void bubbleSort(int arr[], int n)
    {
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
              {
                  if(arr[j] > arr[j+1])
                  {
                     int tmp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = tmp;
                  }
              }
        }
    }
}
