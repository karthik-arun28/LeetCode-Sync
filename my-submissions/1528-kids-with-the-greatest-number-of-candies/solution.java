class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i = 0;
        List<Boolean> res = new ArrayList();
        for(int num: candies){
            if(i<num){
                i=num;
            }
        }
        for(int num1: candies){
            if((num1+extraCandies)>=i){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}
