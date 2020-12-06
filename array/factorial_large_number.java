    /*
        Ques: Given an integer (large), the task is to find factorial of the number.
        Link: https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers/0
        Hint: Use BigInteger
     */
     
     private static Scanner scan = new Scanner(System.in);
     
     private static String fact(int n)
     {
         BigInteger ans = BigInteger.ONE;
         
         for(int i = n; i > 0; i--)
            ans = ans.multiply(BigInteger.valueOf(i));
            
        return ans.toString();
     }
     
	 public static void main (String[] args)
	 {
	    int t = scan.nextInt();
	    while(t-- > 0)
	    {
	        int n = scan.nextInt();
	        System.out.println(fact(n));
	    }
	 }
