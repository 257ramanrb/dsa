    /*
        Ques: Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
        Link: https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
        Hint: Use Map to store frequency of each distinct elem in arr. O(n) time and O(n) space
    */
    
    int getPairsCount(int[] a, int n, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        
        for(int i = 0; i < n; i++)
        {
            if(counts.get(a[i]) == null)
                counts.put(a[i], 1);
            else
                counts.put(a[i], counts.get(a[i]) + 1);
        }
        
        int count1 = 0, count2 =  0;
        
        for(Map.Entry<Integer, Integer> entry : counts.entrySet())
        {
            if(counts.get(k - entry.getKey()) != null)
            {
                if(k - entry.getKey() == entry.getKey())
                {
                    count1 += (counts.get(entry.getKey()) * (counts.get(entry.getKey())-1))/2;
                }
                else
                {
                    count2 += (counts.get(k - entry.getKey()) * counts.get(entry.getKey()));
                }
            }
        }
        
        return count1 + count2/2;
    }
