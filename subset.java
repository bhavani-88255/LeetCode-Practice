package BrackTracking;
import java.util.*;

public class Subset {

    public static void findSubsets(int[] a, int index,
                                   List<Integer> current,
                                   List<List<Integer>> ans) {

        if(index == a.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(a[index]);
        findSubsets(a, index + 1, current, ans);

        // Exclude current element
        current.remove(current.size() - 1);
        findSubsets(a, index + 1, current, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<List<Integer>> ans = new ArrayList<>();

        findSubsets(a, 0, new ArrayList<>(), ans);

        System.out.println(ans);
    }
}