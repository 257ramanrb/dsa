import java.util.*;

class GFG
 {
     
     /*
        Ques: Given an array, cyclically rotate an array by one.
        Link: https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one/0
        Hint: Reversal algo to rotate by 'k' 
     */
     
     private static Scanner scan = new Scanner(System.in);
     
     // Reversal algo
     private static void reverse(int[] a, int s, int e)
     {
         for(int i = s, j = e; i < a.length/2; i++, j--)
         {
             int tmp = a[i];
             a[i] = a[j];
             a[j] = tmp;
         }
     }
     
     // rotate right by 1 bit
     private static void rotate(int[] a)
     {
         int last = a[a.length-1];
         
         for(int i = a.length-1; i > 0; i--)
         {
             a[i] = a[i-1];
         }
         a[0] = last;
     }
     
	 public static void main (String[] args)
	 {
	    int t = scan.nextInt();
	    while(t-- > 0)
	    {
	        int n = scan.nextInt();
	        int[] a = new int[n];
	        
	        for(int i = 0; i < n; i++)
	            a[i] = scan.nextInt();
	           
	       // reverse(a, a.length-1, a.length-1);
	       // reverse(a, 0, a.length-2);
	       // reverse(a, 0, a.length-1);
	        
	        rotate(a);
	        
	        for(int i : a)
	        {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	 }
}
