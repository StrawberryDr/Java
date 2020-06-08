
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Main {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(null == root){
            return true;
        }else {
            int left = deepTree(root.left);
            int right = deepTree(root.right);
            if(Math.abs(left - right) <= 1){
                return isBalance(root.left) && isBalance(root.right);
            }else {
                return false;
            }
        }
    }

    //获得树的高度
    public int deepTree(TreeNode root){
        if(null != root){
            int left = deepTree(root.left);
            int right = deepTree(root.right);
            return left>right ? left+1 : right+1;
        }else {
            return 0;
        }
    }
}
