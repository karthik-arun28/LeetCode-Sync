class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> resList = new ArrayList<>();
        for(int n: nums){
            if(!resList.contains(n)){
                resList.add(n);
                nums[resList.size()-1]=n;
            }
        }
        return resList.size();
    }
}
