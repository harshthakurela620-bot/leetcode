class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=0;
        for(l=0; l<nums.length;l++){
            if (nums[l]!=0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                r++;
            }
        }
    }
}