/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    
    /*
        Ques: Given a binary tree, find its height.
        Link: https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
        Hint: find height of left & right subtree. return max of formers + 1;
    */
    int height(Node node) {
        if(node == null)
            return 0;
        
        int left = height(node.left);
        int right = height(node.right);
        
        return Math.max(left, right) + 1;
    }
}
