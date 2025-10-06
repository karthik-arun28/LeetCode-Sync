class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==k){
            return avg(nums, 0, k-1, k);
        }
        else{
            int i = 0;
            int j = i+k-1;
            double res = 0.0;
            while(j<nums.length){
                double temp = avg(nums, i, j, k);
                if(temp>0.0){
                    if(temp>res){
                        res=temp;
                    }
                }
                else{
                    if(res==0.00000){
                        res = temp;
                    }
                    else if(temp>res){
                        res = temp;
                    }
                }
                i++;
                j++;
            }
            return res;
        }
    }

    private double avg(int[] nums, int s, int e, int k){
        int r = 0;
        for(int i = s; i<=e;i++){
            r+=nums[i];
        }
        return (double) r/k;
    }
}
