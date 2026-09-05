class Solution {
    private static Map<Integer, Integer> resMap = new HashMap<>();
    public int climbStairs(int n) {
        if (n==1) return 1;
        if (n==2) return 2;
        if(resMap.containsKey(n)) return resMap.get(n);
        int result = climbStairs(n-1)+climbStairs(n-2);
        resMap.put(n, result);
        return result;
    }
}
