/*
        Ques: Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
        Link: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1
        Hint: Use insertion sort, O(n*m); if extra space allowed, use merge() of merge sort, O(n+m) with O(n+m) space.
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
                i++;
            }
            else
            {
                i++;
                // j++;
            }
        }
    }
