class Solution {
    public int maxArea(int[] h) {
        int i = 0; int j = h.length - 1;
        int area = 0; int dis = 0; int finalarea = 0;

        while(i<j){
            dis = j-i;
            area = dis*Math.min(h[i],h[j]);
            if(area>finalarea){
                finalarea = area;
            }
            if(h[i]<h[j]){
                i++;
            }else if(h[i]>h[j]){
                j--;
            }else{
                if(h[i+1]>h[i]){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return finalarea;
    }
}