/*
Structure of a Node is as follows:-
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

class Solution
{
    /*
        Ques: Given a Binary Search Tree and a node value X.
              Delete the node with the given value X from the BST. 
              If no node with value x exists, then do not make any change.
        Link: https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1
    */
    
    private static int inOrderSuccesssor(Node root)
    {
        Node tmp = root;
        while(tmp.left != null)
        {
            tmp = tmp.left;
        }
        return tmp.data;
    }
    
    // Return the root of the modified BST after deleting the node with value X
    public static Node deleteNode(Node root, int X)
    {
      if(root == null)
          return null;

      if(X < root.data)
          root.left = deleteNode(root.left, X);
      else if(X > root.data)
          root.right = deleteNode(root.right, X);
        else 
        {
            // case 1: No child
            if(root.left == null && root.right == null)
                return null;

            // case 2: 1 child
            if(root.left == null)
                return root.right;

            if(root.right == null)
                return root.left;

            // case 3: 2 children
            int data = inOrderSuccesssor(root.right);
            root.data = data;
            root.right = deleteNode(root.right, data);
          }
          return root;
    }
}	
