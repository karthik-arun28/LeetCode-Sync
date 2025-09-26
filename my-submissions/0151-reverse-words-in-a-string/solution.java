class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.trim().split("");
        String res = "";
        int startIndex = 0;
        int endIndex = 0;
        boolean flag = false;
        for(int i = strArr.length - 1; i>=0;i--){
            if(!strArr[i].equals(" ") && !flag){
                startIndex = i;
                flag = true;
            }
            if(strArr[i].equals(" ") && flag){
                endIndex = i;
                flag = false;
                res+=reverse(startIndex, endIndex+1, strArr)+" ";
            }
        }
        if(flag){
            res+=reverse(startIndex, 0, strArr);
        }
        return res;
    }

    private String reverse(int s, int e, String[] strArr){
        String result = "";
        while(s>=e){
            result+=strArr[e];
            e++;
        }
        return result;
    }
}
