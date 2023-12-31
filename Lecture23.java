
import java.util.ArrayList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class LongestPathRootToLeaf {
    public static ArrayList<Integer> getLongestPath(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        
        ArrayList<Integer> path = new ArrayList<>();
        path.add(root.data);
        
        ArrayList<Integer> leftLongestPath = getLongestPath(root.left);
        ArrayList<Integer> rightLongestPath = getLongestPath(root.right);
        
        ArrayList<Integer> result = getMax(leftLongestPath, rightLongestPath);
        
        if (result != null) {
            path.addAll(result);
        }
        
        return path;
    }

    private static ArrayList<Integer> getMax(ArrayList<Integer> leftLongestPath, ArrayList<Integer> rightLongestPath) {
        if (leftLongestPath == null && rightLongestPath == null) {
            return null;
        }
        
        if (leftLongestPath == null) {
            return rightLongestPath;
        }
        
        if (rightLongestPath == null) {
            return leftLongestPath;
        }
        
        if (leftLongestPath.size() > rightLongestPath.size()) {
            return leftLongestPath;
        } else {
            return rightLongestPath;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(7);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(12);
        root.right.right.right = new TreeNode(11);
        root.right.right.right.right = new TreeNode(10);

        ArrayList<Integer> result = getLongestPath(root);
        
        for (Integer data : result) {
            System.out.print(data + " ");
        }
    }
}
