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
        Ques: Given a binary tree, find the Postorder Traversal of it.
        Link: https://practice.geeksforgeeks.org/problems/postorder-traversal/1
        Hint: "Post"order is the position of root node. left, right, root.
    */
    
    ArrayList<Integer> postOrder(Node root)
    {
    //   ArrayList<Integer> postOrderTrav = new ArrayList<>();
    //   postOrderRec(root, postOrderTrav);
    //   return postOrderTrav;
        return postOrderIterative(root);
    }
    
    // Post order traversal using recursive approach
    void postOrderRec(Node root, ArrayList<Integer> postOrderTrav)
    {
        if(root == null)
            return;
        postOrderRec(root.left, postOrderTrav);
        postOrderRec(root.right, postOrderTrav);
        postOrderTrav.add(root.data);
    }
    
    // Post order traversal using iterative approach (using two stacks)
    ArrayList<Integer> postOrderIterative(Node root)
    {
        ArrayList<Integer> postOrderTrav = new ArrayList<>();
        Stack<Node> s1 = new Stack<>(), s2 = new Stack<>();
        
        if(root != null)
        {
            s1.push(root);
            while(s1.size() != 0)
            {
                Node top = s1.pop();
                
                if(top.left != null)
                    s1.push(top.left);
                if(top.right != null)
                    s1.push(top.right);
                
                s2.push(top);
            }
            
            while(s2.size() != 0)
            {
                postOrderTrav.add(s2.pop().data);
            }
        }
        
        return postOrderTrav;
    }
}
