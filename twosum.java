class Solution {
    public int[] twoSum(int[] a, int t) {
        int n=a.length;
        int[] ans=new int[2];
        int s=0,e=n-1,sum=0;
        while(s<e){
            sum=a[s]+a[e];
            if(sum==t){
                ans[0]=s+1;
                ans[1]=e+1;
                break;
            }else if(sum>t){
                e--;
            }
            else{
                s++;}
        }
        return ans;
    }
}