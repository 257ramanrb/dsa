class Solution
{
    /*
        Ques: Given an unsorted array of size N, use insertion sort to sort arr[] in increasing order.
        Link: https://practice.geeksforgeeks.org/problems/selection-sort/1 (Try all sorts in this ques only)
    */
    void insertionSort(int arr[], int n)
    {
          for(int i = 1; i < n; i++)
          {
              int j = i-1;
              int key = arr[i];

              while(j >= 0 && arr[j] > key)
              {
                  arr[j+1] = arr[j];
                  j--;
              }

              arr[j+1] = key;
          }
    }
}
