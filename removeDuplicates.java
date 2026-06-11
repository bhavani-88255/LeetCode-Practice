class Solution {
    public int removeDuplicates(int[] a) {
        int n=a.length,i=1,j=0;
        for(i=1;i<n;i++){
           if(a[i]!=a[j]){
            ++j;
            a[j]=a[i];
           }
        }
        return j+1;
    }
}