class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length ; i++){
            if(n==0){
                return true;
            }
            if(flowerbed[i]==1){
                continue;
            }
            else{
                if(i==0){
                        if((i+1)<(flowerbed.length)){
                            if(flowerbed[i+1]==0){
                            flowerbed[i]=1;
                            n--;
                            }
                        }
                        else{
                            flowerbed[i]=1;
                            n--;
                        }
                }
                else{
                    if(flowerbed[i-1]==0 && (i+1)<(flowerbed.length-1) && flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                    else{
                        if(i==flowerbed.length-1 && flowerbed[i-1]==0){
                            flowerbed[i]=1;
                            n--;
                        }
                    }
                }
            }
        }
        if(n==0){
            return true;
        }
        return false;
    }
}
