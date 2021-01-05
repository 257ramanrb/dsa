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
class Solution
{
    /*
        Ques: Given a binary tree, find its level order (breadth-first) traversal.
        Link: https://practice.geeksforgeeks.org/problems/level-order-traversal/1
        Hint: Use queue.
    */
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> levelOrder = new ArrayList<>();
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()) // or queue.size() != 0
        {
            Node front = queue.remove(); // queue.peek() => returns node at front but doesn't delete.
            if(front.left != null)
                queue.add(front.left);
            if(front.right != null)
                queue.add(front.right);
                
            levelOrder.add(front.data);
        }
        
        return levelOrder;
    }
}
