    /*
        Ques: Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers. If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order). The replacement must be in place and use only constant extra memory.
        Link: https://leetcode.com/problems/next-permutation/
    */
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pos = n-1;
        
        while(pos > 0 && nums[pos] <= nums[pos-1])
        {
            pos--;    
        }
        
        if(pos == 0)
        {
            Arrays.sort(nums);
        }else
        {
            Arrays.sort(nums, pos, n);
            
            int curr = nums[pos-1];
            for(int i = pos; i < n; i++)
            {
                if(nums[i] > curr)
                {
                    nums[pos-1] = nums[i];
                    nums[i] = curr;
                    break;
                }
            }
        }
    }
