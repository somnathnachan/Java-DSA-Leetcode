class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int j = -1;

        for(int i=0; i<n; i++)
        {
            if(nums[i] == 0)
            {
                j = i;
                break;
            }
        }

        int k = j + 1;
        while(k < n && j < n && j != -1)
        {
            if(nums[k] != 0)
            {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] =  temp; 
                j++;
            }
            else
            {
                k++;
            }
        }
    }
}
