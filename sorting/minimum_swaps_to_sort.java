class Solution {
    
    /*
        Que: Given an array of n distinct elements. Find the minimum number of swaps
             required to sort the array in strictly increasing order.
        Link: https://practice.geeksforgeeks.org/problems/minimum-swaps/1
        Hint: https://www.youtube.com/watch?v=1BxbBgNSwHo
    */
    
    static class Element implements Comparable<Element>
    {
        int index;
        int value;
        
        Element(int index, int value)
        {
            this.index = index;
            this.value = value;
        }
        
        @Override
        public int compareTo(Element e)
        {
            return this.value - e.value;
        }
    }
    
    public int minSwaps(int[] arr, int n) {
        int swaps = 0;
        Element[] elements = new Element[n];

        for(int i = 0; i < n; i++)
            elements[i] = new Element(i, arr[i]);

        Arrays.sort(elements);

        for(int i = 0; i < n; i++)
        {
            if(elements[i].index != i)
            {
                Element tmp = elements[i];
                elements[i] = elements[tmp.index];
                elements[tmp.index] = tmp;
                swaps++;
                i--;
            }
        }
        return swaps;
    }
}
