class Solution {

    public List<Integer> leftView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if(root == null)
            return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            int levelsize = queue.size();

            for(int i = 0; i < levelsize; i++) {

                TreeNode currentNode = queue.poll();

                if(i == 0)
                    ans.add(currentNode.val);

                if(currentNode.left != null)
                    queue.offer(currentNode.left);

                if(currentNode.right != null)
                    queue.offer(currentNode.right);
            }
        }

        return ans;
    }
}