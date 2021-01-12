/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    
   {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    /*
        Ques: Given a Binary Tree, convert it into its mirror.
        
               1    (mirror)  1
             /  \    =>      /  \
            3    2          2    3
            
        Link: https://practice.geeksforgeeks.org/problems/mirror-tree/1#
        Hint: Left and right subtrees are interchanged for every node => lateral inversion as happens in mirror
    */
    void mirror(Node node)
    {
	    if(node == null)
	        return;
	    
	    mirror(node.left);
	    mirror(node.right);
	    
	    Node tmp = node.left;
	    node.left = node.right;
	    node.right = tmp;
    }
}
