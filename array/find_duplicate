/*
        Ques: Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.               There is only one duplicate number in nums, return this duplicate number.
        Link: https://leetcode.com/problems/find-the-duplicate-number/
        Hint: Use Set, O(n) space, O(n) time; Make arr[pos] *= -1, O(1) space, O(n) time;
    */
    
    public int findDuplicateConstantSpace(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[Math.abs(nums[i])-1] < 0)
                return Math.abs(nums[i]);
            nums[Math.abs(nums[i])-1] *= -1;
        }
        return -1;
    }
    
    public int findDuplicateExtraSpace(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(set.contains(nums[i]))
                return nums[i];
            set.add(nums[i]);
        }
        return -1;
    }
