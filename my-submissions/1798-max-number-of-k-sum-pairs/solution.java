class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int c = 0;
        while(i<j){
            int diff = k-nums[i];
                if(nums[j]==diff){
                    c++;
                    i++;
                    j--;
                }
                else if(nums[j] > diff){
                    j--;
                }
                else{
                    i++;
                }
        }
        return c;
    }
}
