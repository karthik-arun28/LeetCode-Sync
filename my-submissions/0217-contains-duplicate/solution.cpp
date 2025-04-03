class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> hashSet;
        for(int i : nums){
            if(hashSet.count(i) > 0){
                return true;
            }
            hashSet.insert(i);
        }
        return false;
    }
};
