/*
    Ques: Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
    Link: https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
    Hint: Randomized Quick select; partition of quicksort is used as it is; O(n^2) still in worst case but highly unlikely; practically avg is O(n) due to randomized.
*/

// Randomized quick select => same logic for randomized quick sort
public static int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
}

private static int partition(int[] a, int s, int e)
{
    int r = getRandomNumber(s, e);   
    
    int tmp2 = a[r];
    a[r] = a[s];
    a[s] = tmp2;
    
    int i = s, j = e, p = s;
    
    while(i < j)
    {
        while(i < e && a[i] <= a[p])
        {
            i++;
        }
        
        while(j >= s && a[j] > a[p])
        {
            j--;
        }
        
        if(i < j)
        {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
    
    int tmp = a[p];
    a[p] = a[j];
    a[j] = tmp;
    
    return j;
}

public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    if(l < r)
    {
        int partition = partition(arr, l, r);
        if(partition == k-1)
            return arr[partition];
        if(partition < k-1)
        {
            return kthSmallest(arr, partition+1, r, k);
        }
        else
            return kthSmallest(arr, l, partition-1, k);
    }
    return arr[l];
} 
