import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {     
        int result=0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i : nums){
            pQueue.add(i);
        }
        for(int j=0;j<k;j++){
            result=pQueue.poll();
        }
        return result;
    }
}
