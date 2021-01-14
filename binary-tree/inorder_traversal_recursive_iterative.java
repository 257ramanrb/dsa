/* A Binary Tree node 

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree
{
    
    /*
        Ques: Given a Binary Tree, find the In-Order Traversal of it (Both, in recursive and iterative ways).
        Link: https://practice.geeksforgeeks.org/problems/inorder-traversal/1#
        Hint: "In"order represents position of root. (left, root, right) 
    */
    
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // ArrayList<Integer> inOrderTrav = new ArrayList<>();
        // inOrderRec(root, inOrderTrav);
        // return inOrderTrav;
        return inOrderIterative(root);
    }
    
    // Recursive inorder traversal
    void inOrderRec(Node root, ArrayList<Integer> inOrderTrav)
    {
        if(root == null)
            return;
        inOrderRec(root.left, inOrderTrav);
        inOrderTrav.add(root.data);
        inOrderRec(root.right, inOrderTrav);
    }
    
    // Iterative inorder traversal
    ArrayList<Integer> inOrderIterative(Node root)
    {
        ArrayList<Integer> inOrderTrav = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        
        while(curr != null || stack.size() != 0)
        {
            while(curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            
            curr = stack.pop();
            inOrderTrav.add(curr.data);
            curr = curr.right;    
        }
        return inOrderTrav;
    }
   
}
