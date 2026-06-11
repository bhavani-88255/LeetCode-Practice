class Solution {
    public void moveZeroes(int[] a) {
        int n=a.length;
        int i=0,j=0;
        for(j=0;j<n;j++){
            if(a[j]==0){
                break;
            }
        }
        for(i=j+1;i<n;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        
    }
}