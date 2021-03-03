/*
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

class GfG
{
    /*
        Ques: Given a Binary Tree. Check whether it is Symmetric or not, 
              i.e. whether the binary tree is a Mirror image of itself or not.
              Similar ques can be two check whether given two trees are mirror of each other.
        Link: https://practice.geeksforgeeks.org/problems/symmetric-tree/1
    */
    
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        return isSymmetricHelper(root, root);
    }
    
    private static boolean isSymmetricHelper(Node root1, Node root2) {
        if(root1 == null && root2 == null)
            return true;
        
        if(root1 != null && root2 != null)
        {
            if(root1.data == root2.data)
                return (isSymmetricHelper(root1.left, root2.right) && isSymmetricHelper(root1.right, root2.left));
        }
        
        return false;
    }
}
