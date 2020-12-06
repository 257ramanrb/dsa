/*
    Ques: Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
    Link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
    Hint: 3 pointer approach; low=0, mid=0, high=n-1; while(mid<=high); O(n)
*/

public static void sort012(int a[], int n){
    int low = 0, mid = 0, high = n-1; 
    
    while(mid <= high)
    {
        if(a[mid] == 1)
            mid++;
        else if(a[mid] == 0)
        {
            int tmp = a[mid];
            a[mid] = a[low];
            a[low] = tmp;
            low++;
            mid++;
        }else
        {
            int tmp = a[mid];
            a[mid] = a[high];
            a[high] = tmp;
            high--;
        }
    }
}
