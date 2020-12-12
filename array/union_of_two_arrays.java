     /*
        Ques: Given two arrays A and B of size N and M respectively. The task is to find union between these two arrays.
              Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in union.
        Link: https://practice.geeksforgeeks.org/problems/union-of-two-arrays/0
     */
     public static void main (String[] args)
	 {
	    int t = scan.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = scan.nextInt();
	        int m = scan.nextInt();
	        
	        int[] a = new int[n], b = new int[m];
	        Set<Integer> set = new HashSet<>();
	        
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = scan.nextInt();
	            set.add(a[i]);
	        }
	            
	        for(int i = 0; i < m; i++)
	        {
	            b[i] = scan.nextInt();
	            set.add(b[i]);
	        }
	            
	        System.out.println(set.size());
	   }
