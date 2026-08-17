class Solution {
    public boolean isValid(String s) {
        List<Character> cArr = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(cArr.isEmpty()){
                cArr.add(c);
            }
            else{
                if((cArr.get(cArr.size()-1)=='(' && c==')') ||
                (cArr.get(cArr.size()-1)=='[' && c==']') ||
                (cArr.get(cArr.size()-1)=='{' && c=='}')){
                    cArr.remove(cArr.size()-1);
                }
                else{
                    cArr.add(c);
                }
            }
        }
        System.out.println(cArr.size());
        if(cArr.size()==0){
            return true;
        }
        return false;
    }
}
