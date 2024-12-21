class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap();
        int res = 0;
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        String[] arr = s.split("");
        for(int i =0; i<arr.length; i++){
            if(i != arr.length - 1 && (romanMap.get(arr[i]) < romanMap.get(arr[i+1])))
            {
                System.out.println("inside if if"+ i);
                res += (romanMap.get(arr[i+1]) - romanMap.get(arr[i]));
                i++;
            }
            else{
                if(i == arr.length - 1 && arr.length > 1 && (romanMap.get(arr[i]) > romanMap.get(arr[i-1]) )){
                    System.out.println("inside else if" + i);
                    continue;
                }
                else{
                    System.out.println("inside else else"+ i);
                    res += romanMap.get(arr[i]);
                }
            }
        }
        return res;
    }
}
