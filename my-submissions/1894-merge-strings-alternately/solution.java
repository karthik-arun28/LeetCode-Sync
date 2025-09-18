class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int j = 0;
        if(word1.length()>word2.length()){
            j=word1.length();
        }
        else{
            j=word2.length();
        }
        for(int i = 0; i<j; i++){
            if(i<=(word1.length()-1)){
                res+=word1.charAt(i);
            }
            if(i<=(word2.length()-1)){
                res+=word2.charAt(i);
            }
        }
        return res;
    }
}
