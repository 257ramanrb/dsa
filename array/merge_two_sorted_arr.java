class Solution {
    
    /*
        Ques: Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
        Link: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1
        Hint: 
            - Use insertion sort, O(n*m); if extra space allowed, use merge() of merge sort, O(n+m) with O(n+m) space.
            - https://www.youtube.com/watch?v=hVl2b3bLzBw
    */

    /*
        Using merge() of merge sort; uses extra space; 
        Time: O(n+m)
        Space: O(n+m)
    */
    public void mergeWithExtraSpace(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0, k = 0;
        
        int[] tmp = new int[n+m];
        
        while(i < n && j < m)
        {
            if(arr1[i] < arr2[j])
                tmp[k++] = arr1[i++];
            else
                tmp[k++] = arr2[j++];
        }
        
        while(i < n)
        {
            tmp[k++] = arr1[i++];
        }
        
        while(j < m)
        {
            tmp[k++] = arr2[j++];
        }
        
        for(int p = 0; p < n; p++)
        {
            arr1[p] = tmp[p]; 
        }
        
        for(int p = n; p < n+m; p++)
        {
            arr2[p-n] = tmp[p]; 
        }
    }
    
    /*
        Using insertion sort O(n*m); no extra space
        Time: O(n*m)
        Space: O(1)
        Hint video: https://www.youtube.com/watch?v=hVl2b3bLzBw
    */
    private void insertionSort(int[] a, int n)
    {
        int curr = a[0], j = 1;
        while(j < n && a[j] < curr)
        {
            a[j-1] = a[j];
            j++;
        }
        a[j-1] = curr;
    }

    public void merge(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        
        while(i < n && j < m)
        {
            if(arr1[i] > arr2[j])
            {
                int tmp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = tmp;
                
                insertionSort(arr2, m);
            }
            i++;
        }
    }
}
