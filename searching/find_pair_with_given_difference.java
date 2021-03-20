import java.util.*;

class Solution
{
    /*
        Ques: Given an unsorted array Arr[] and a number N. You need to write a program
              to find if there exists a pair of elements in the array whose difference is N.
        Link: https://practice.geeksforgeeks.org/problems/find-pair-given-difference/0
    */
     
    private static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {
       int t = scan.nextInt();

       while(t-- > 0)
       {
              int l = scan.nextInt();
            int n = scan.nextInt();

            int[] arr = new int[l];
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < l; i++)
            {
                arr[i] = scan.nextInt();
                map.put(arr[i], Math.abs(n - arr[i]));
            }

            boolean isExist = false;
            for(int i = 0; i < l; i++)
            {
                if(map.get(Math.abs(n - arr[i])) != null)
                {
                    isExist = true;
                    break;
                }
            }

            if(isExist)
                System.out.println("1");
            else
                System.out.println("-1");
        }
     }
}
