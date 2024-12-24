class Solution {
    public int lengthOfLastWord(String s) {
        int lenOfWord = 0;
        boolean flag = false;
        for(int i=s.length() - 1; i>=0;i--){
            if(s.charAt(i)!=' '){
                flag = true;
                lenOfWord++;
            }
            if(s.charAt(i)==' ' && flag == true){
                break;
            }
        }
    return lenOfWord;
    }
}
