class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        if(strs.length == 1){
            s=strs[0];
        }
        else{
            for(int i = 0; i<strs.length - 1; i++){
            if(i>0 && s.equals("")){
                break;
            }
            if(strs[i].length()>strs[i+1].length()){
                for(int j = strs[i+1].length(); j >=0; j--){
                    if(strs[i].startsWith(strs[i+1].substring(0, j))){
                        if(!s.equals("") && s.length() < strs[i+1].substring(0, j).length()){
                            continue;
                        }
                        else{
                            s=strs[i+1].substring(0, j);
                        }
                        break;
                    }
                }
            }
            else{
                for(int j = strs[i].length(); j >=0; j--){
                    if(strs[i+1].startsWith(strs[i].substring(0, j))){
                        if(!s.equals("") && s.length() < strs[i].substring(0, j).length()){
                            continue;
                        }
                        else{
                            s=strs[i].substring(0, j);
                        }
                        break;
                    }
                }
            }
        }
        }
        return s;
    }
}
