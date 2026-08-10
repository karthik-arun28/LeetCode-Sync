class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                res++;
                nums[j]=nums[i];
                j++;
            }
        }
        return res;
    }
}
