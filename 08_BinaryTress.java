import java.util.*;

class Solution {
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public Integer data;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 


// BINARY TREE POSTORDER TRAVERSAL

// Given the root of a binary tree, return the postorder traversal of its nodes' values.

// Example 1:
// Input: root = [1,null,2,3]
// Output: [3,2,1]


//     List<Integer> see = new ArrayList<>();
//     public List<Integer> postorderTraversal(TreeNode root) {
//         solve(root);
//         return see;
//     }
//     public void solve(TreeNode root){
//         if(root == null) return;
//         solve(root.left);
//         solve(root.right);
//         see.add(root.val);
//     }









//BT LEVEL ORDER TRAVERSAL

// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[9,20],[15,7]]


//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         if (root == null) return result;

//         Queue<TreeNode> q = new LinkedList<>();
//         q.offer(root);

//         while (!q.isEmpty()) {
//             int size = q.size();          // ← nodes at current level
//             List<Integer> level = new ArrayList<>();

//             for (int i = 0; i < size; i++) {
//                 TreeNode node = q.poll();
//                 level.add(node.val);
//                 if (node.left  != null) q.offer(node.left);
//                 if (node.right != null) q.offer(node.right);
//             }
//             result.add(level);
//         }
//         return result;
//     }







//Iterative Preorder Traversal 
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> preorder = new ArrayList<Integer>();
    //     if(root == null) return preorder;
    //     Stack<TreeNode> st = new Stack<TreeNode>();
    //     st.push(root);
    //     while(!st.isEmpty()){
    //         root = st.pop();
    //         preorder.add(root.val);
    //         if(root.right != null){
    //             st.push(root.right);
    //         }
    //         if(root.left != null){
    //             st.push(root.left);
    //         }
    //     }
    //     return preorder;
    // }












    //MAXIMUM DEPTH OF BINARY TREE

//     Given the root of a binary tree, return its maximum depth.
//     A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
        // public int maxDepth(TreeNode root) {
        //     if(root == null) {
        //         return 0;
        //     }

        //     int left = maxDepth(root.left);
        //     int right = maxDepth(root.right);

        //     return 1 + Math.max(left, right);
        // }















        //BALANCED BINARY TREE
        // Given a binary tree, determine if it is height-balanced.

        // Example 1:
        // Input: root = [3,9,20,null,null,15,7]
        // Output: true

        // public boolean isBalanced(TreeNode root) {
        //     return height(root) != -1;
        // }
        // public int height(TreeNode root) {
        //     if(root == null) {
        //         return 0;
        //     }
        //     int left = height(root.left);
        //     if(left == -1) {
        //         return -1;
        //     }
        //     int right = height(root.right);
        //     if(right == -1) {
        //         return -1;
        //     }
        //     if(Math.abs(left - right) > 1) {
        //         return -1;
        //     }
        //     return 1 + Math.max(left, right);
        // }







        //DIAMETER OF BINARY TREE
        // Given the root of a binary tree, return the length of the diameter of the tree
        // The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the
        // root.

        // Example 1:
        // Input: root = [1,2,3,4,5]
        // Output: 3
        // Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

        // Example 2:
        // Input: root = [1,2]
        // Output: 1

        // int diameter = 0;
        // public int diameterOfBinaryTree(TreeNode root) {
        //     height(root);
        //     return diameter;
        // }
        // public int height(TreeNode root) {
        //     if(root == null) {
        //         return 0;
        //     }
        //     int left = height(root.left);
        //     int right = height(root.right);
        //     diameter = Math.max(diameter, left + right);
        //     return 1 + Math.max(left, right);
        // }

















        //BINARY TREE MAXIMUM PATH SUM
        // A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
        // The path sum of a path is the sum of the node's values in the path.
        // Given the root of a binary tree, return the maximum path sum of any non-empty path.

        // Example 1:
        // Input: root = [1,2,3]
        // Output: 6
        // Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
        
        // Example 2:
        // Input: root = [-10,9,20,null,null,15,7]
        // Output: 42
        // Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.


        // int see = Integer.MIN_VALUE;
        // public int maxPathSum(TreeNode root) {
        //     solve(root);
        //     return see;
        // }
        // public int solve(TreeNode root) {
        //     if(root == null) {
        //         return 0;
        //     }
        //     int left = Math.max(0, solve(root.left));
        //     int right = Math.max(0, solve(root.right));
        //     int temp = left + right + root.val;
        //     see = Math.max(see, temp);
        //     return root.val + Math.max(left, right);
        // }









        // BINARY TREE ZIGZAG LEVEL ORDER TRAVERSAL
        // Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

        // Example 1:
        // Input: root = [3,9,20,null,null,15,7]
        // Output: [[3],[20,9],[15,7]]

        // Example 2:
        // Input: root = [1]
        // Output: [[1]]
    //     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     if(root == null) {
    //         return ans;
    //     }
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.offer(root);
    //     boolean leftToRight = true;
    //     while(!q.isEmpty()) {
    //         int size = q.size();
    //         List<Integer> level = new ArrayList<>();
    //         for(int i = 0; i < size; i++) {
    //             TreeNode node = q.poll();
    //             level.add(node.val);
    //             if(node.left != null) {
    //                 q.offer(node.left);
    //             }
    //             if(node.right != null) {
    //                 q.offer(node.right);
    //             }
    //         }
    //         if(!leftToRight) {
    //             Collections.reverse(level);
    //         }
    //         ans.add(level);
    //         leftToRight = !leftToRight;
    //     }
    //     return ans;
    // }






    //Boundary Traversal in Binary Tree        
        // boolean isLeaf(TreeNode root) {
        //     return root.left == null && root.right == null;
        // }

        // void addLeftBoundary(TreeNode root, ArrayList<Integer> ans) {
        //     TreeNode curr = root.left;

        //     while(curr != null) {
        //         if(!isLeaf(curr)) {
        //             ans.add(curr.data);
        //         }

        //         if(curr.left != null) {
        //             curr = curr.left;
        //         } else {
        //             curr = curr.right;
        //         }
        //     }
        // }

        // void addLeaves(TreeNode root, ArrayList<Integer> ans) {
        //     if(root == null) return;

        //     if(isLeaf(root)) {
        //         ans.add(root.data);
        //         return;
        //     }

        //     addLeaves(root.left, ans);
        //     addLeaves(root.right, ans);
        // }

        // void addRightBoundary(TreeNode root, ArrayList<Integer> ans) {
        //     TreeNode curr = root.right;
        //     ArrayList<Integer> temp = new ArrayList<>();

        //     while(curr != null) {
        //         if(!isLeaf(curr)) {
        //             temp.add(curr.data);
        //         }

        //         if(curr.right != null) {
        //             curr = curr.right;
        //         } else {
        //             curr = curr.left;
        //         }
        //     }

        //     for(int i = temp.size() - 1; i >= 0; i--) {
        //         ans.add(temp.get(i));
        //     }
        // }

        // ArrayList<Integer> boundaryTraversal(TreeNode root) {
        //     ArrayList<Integer> ans = new ArrayList<>();

        //     if(root == null) return ans;

        //     if(!isLeaf(root)) {
        //         ans.add(root.data);
        //     }

        //     addLeftBoundary(root, ans);
        //     addLeaves(root, ans);
        //     addRightBoundary(root, ans);

        //     return ans;
        // }
















        //BINARY TREE RIGHT SIDE VIEW

        // Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

        // Example 1:
        // Input: root = [1,2,3,null,5,null,4]
        // Output: [1,3,4]

        // Example 2:
        // Input: root = [1,2,3,4,null,null,null,5]
        // Output: [1,3,4,5]


        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if(root == null) {
                return ans;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()) {
                int size = q.size();
                List<Integer> level = new ArrayList<>();
                for(int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    level.add(node.val);
                    if(node.left != null) {
                        q.offer(node.left);
                    }
                    if(node.right != null) {
                        q.offer(node.right);
                    }
                }
                ans.add(level.get(level.size() - 1));
            }
            return ans;
        }
}
