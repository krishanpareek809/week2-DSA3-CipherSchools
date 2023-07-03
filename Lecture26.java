import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> zigzagLevelOrder(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        
        LinkedList<TreeNode> dq = new LinkedList<>();
        dq.addFirst(root);
        boolean leftToRight = true;
        
        while (!dq.isEmpty()) {
            int size = dq.size();
            
            if (leftToRight) {
                for (int i = 0; i < size; i++) {
                    TreeNode currentNode = dq.removeFirst();
                    if (currentNode.left != null) {
                        dq.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        dq.addLast(currentNode.right);
                    }
                    resultList.add(currentNode.val);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    TreeNode currentNode = dq.removeLast();
                    if (currentNode.right != null) {
                        dq.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        dq.addFirst(currentNode.left);
                    }
                    resultList.add(currentNode.val);
                }
            }
            
            leftToRight = !leftToRight;
        }
        
        return resultList;
    }
}


class Solution {
    public List<Integer> zigzagLevelOrder(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }

        LinkedList<TreeNode> dq = new LinkedList<>();
        dq.addFirst(root);
        boolean leftToRight = true;

        while (!dq.isEmpty()) {
            int size = dq.size();

            if (leftToRight) {
                for (int i = 0; i < size; i++) {
                    TreeNode currentNode = dq.removeFirst();
                    if (currentNode.left != null) {
                        dq.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        dq.addLast(currentNode.right);
                    }
                    resultList.add(currentNode.val);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    TreeNode currentNode = dq.removeLast();
                    if (currentNode.right != null) {
                        dq.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        dq.addFirst(currentNode.left);
                    }
                    resultList.add(currentNode.val);
                }
            }

            leftToRight = !leftToRight;
        }

        return resultList;
    }
}
