class MyHashSet {
    
private:
    const int SIZE = 1001;
    int hash(int index){
        return index % SIZE;
    }
    
public:
    vector<list<int>> hashVec;
    MyHashSet() {
        hashVec.resize(SIZE);
    }
    
    void add(int key) {
        if(contains(key)){
            return;
        }
        int index = hash(key);
        hashVec[index].push_back(key);
    }
    
    void remove(int key) {
        if(!contains(key)){
            return;
        }
        int index = hash(key);
        hashVec[index].remove(key);
    }
    
    bool contains(int key) {
        int index = hash(key);
        for(int hashKey : hashVec[index]){
            if(hashKey == key){
                return true;
            }
        }
        return false;
    }
};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */
