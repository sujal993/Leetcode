class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count = 0;
        int max = 0;
        for(int i = 0 ; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                if(max>count)
                {
                    max = max;
                }
                else
                {
                    max = count;
                }
                count = 0;
            }
            else
            {
                count++;
            }
        }
        if(count>max)
        {
            return count;
        }
        else
        {
            return max;
        }
    }
}