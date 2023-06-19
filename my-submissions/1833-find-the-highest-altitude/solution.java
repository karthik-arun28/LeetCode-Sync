class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int sum = 0;
        for(int i: gain){
            sum += i;
            if(sum>res){
                res=sum;
            }
        }
        return res;        
    }
}
