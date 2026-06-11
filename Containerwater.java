class Solution {
    public int maxArea(int[] a) {
        int n = a.length;
        int s = 0, e = n - 1;
        int ans = 0;

        while (s < e) {
            int area = Math.min(a[s], a[e]) * (e - s);
            ans = Math.max(ans, area);

            if (a[s] < a[e]) {
                s++;
            } else {
                e--;
            }
        }

        return ans;
    }
}