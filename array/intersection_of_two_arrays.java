/*
    Ques: Given two arrays A and B respectively of size N and M, the task is to print the count of elements in the intersection (or common elements) of the two arrays.
          For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 
          EX: [1, 2, 2] & [2, 2] => # of elems in intersection = 1 (2, 2 are common but we want # of distinct common elems)
    Link: https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1#
*/
public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m)
{
    Set<Integer> set = new HashSet<>();
    
    for(int i : a)
        set.add(i);
        
    int count = 0;
    for(int i : b)
        if(set.contains(i))
        {
            count++;   
            set.remove(i);
        }
        
    return count;
}
