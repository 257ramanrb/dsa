
/* 
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
    }
 }
*/

class BinaryTree
{
    /*
        Ques: Given a binary tree, find its preorder traversal.
        Link: https://practice.geeksforgeeks.org/problems/preorder-traversal/1
        Hint: "Pre"order is the position of root node. root, left, right.
    */
    
    // Returns the preorder traversal of binary tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // ArrayList<Integer> preOrderTrav = new ArrayList<>();
        // preorderRec(root, preOrderTrav);
        // return preOrderTrav;
        return preOrderIterative(root);
    }
    
    // Recursive preOrder traversal
    static void preorderRec(Node root, ArrayList<Integer> preOrderTrav)
    {
        if(root == null)
            return;
        preOrderTrav.add(root.data);
        preorderRec(root.left, preOrderTrav);
        preorderRec(root.right, preOrderTrav);
    }

    // Iterative preOrder traversal
    static ArrayList<Integer> preOrderIterative(Node root)
    {
        ArrayList<Integer> preOrderTrav = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        
        while(curr != null || stack.size() != 0)
        {
            while(curr != null)
            {
                stack.push(curr);
                preOrderTrav.add(curr.data);
                curr = curr.left;
            }
            
            curr = stack.pop();
            curr = curr.right;
        }
        
        return preOrderTrav;
    }

}
