/*
Structure of Node:
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class BSTData
{
    boolean isBST;
    Integer min;
    Integer max;
}

public class Solution
{
    /*
        Ques: Given a binary tree. Check whether it is a BST or not.
              Note: We are considering that BSTs can not contain duplicate Nodes.
        Link: https://practice.geeksforgeeks.org/problems/check-for-bst/1
        Hint: https://www.youtube.com/watch?v=kMrbTnd5W9U
    */
    
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root)
    {
        return isBSTHelper(root).isBST;
    }
    
    BSTData isBSTHelper(Node root)
    {
        BSTData mBst = new BSTData();
        
        if(root == null)
        {
            mBst.isBST = true;
            mBst.min = Integer.MAX_VALUE;
            mBst.max = Integer.MIN_VALUE;
        } else
        {
            BSTData lBst = isBSTHelper(root.left);
            BSTData rBst = isBSTHelper(root.right);
            
            mBst.isBST = lBst.isBST && rBst.isBST && (root.data > lBst.max && root.data < rBst.min);
            mBst.min = Math.min(root.data, lBst.min);
            mBst.max = Math.max(root.data, rBst.max);
        }
        
        return mBst;
    }
}
