/*
    class Node  
    { 
       int data; 
       Node left, right; 
   
       public Node(int d)  
       { 
           data = d; 
           left = right = null; 
       } 
    }
*/

class Solution{
    
    /*
        Ques: Given a BST and a key K. If K is not present in the BST, Insert a new Node with a value equal to K into the BST. 
              Note: If K is already present in the BST, don't modify the BST.
        Link: https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1
    */
    
    /* The function returns the root of the BST (currently rooted at 'root') 
       after inserting a new Node with value 'Key' into it. */
    Node insert(Node root, int Key)
    {
        if(root == null)
            return new Node(Key);
        
        if(root.data < Key)
            root.right = insert(root.right, Key);
        else if(root.data > Key)
            root.left = insert(root.left, Key);
            
        return root;
    }
}
