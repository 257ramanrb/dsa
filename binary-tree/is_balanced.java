/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    
    /*
        Ques: Given a binary tree, find if it is height balanced or not. 
              A tree is height balanced if difference between heights of 
              left and right subtrees is not more than one for all nodes of tree. 
        Link: https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1
    */
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
        if(root == null)
            return true;
        if(isBalanced(root.left) && isBalanced(root.right))
        {
    	    int leftHt = height(root.left);
    	    int rightHt = height(root.right);
    	    
    	    if(Math.abs(leftHt-rightHt) <= 1)
    	        return true;
    	    return false;
        }
        return false;
    }
    
    int height(Node root)
    {
        if(root == null)
            return 0;
        
        int leftHt = height(root.left);
        int rightHt = height(root.right);
        
        return Math.max(leftHt, rightHt)+1;
    }
}
