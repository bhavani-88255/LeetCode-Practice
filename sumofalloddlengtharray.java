class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int i=0,occ=0,total=0,c=0;
        for(i=0;i<n;i++){
            occ=((i+1)*(n-i)+1)/2;
            c=arr[i]*occ;
            total+=c;
            

        }
        return total;
    }
}