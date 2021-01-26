/*
 class Node
 {
     int data; //data of the node
     int hd; //horizontal distance of the node
     Node left, right; //left and right references
 
     // Constructor of tree node
     public Node(int key)
     {
         data = key;
         hd = Integer.MAX_VALUE;
         left = right = null;
     }
 }
*/ 

class Tree
{
    /*
        Ques: Given a binary tree, print the bottom view from left to right.
              A node is included in bottom view if it can be seen when we look at the tree from bottom.

                      20
                    /    \
                  8       22
                /   \       \
               5     3       25
                    /  \      
                  10    14

              For the above tree, the bottom view is 5 10 3 14 25.
        Link: https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
        Hint: Similar to "Top view of binary tree".
    */
 
    static class Bottom
    {
        Node node;
        int horDist;
        
        Bottom(Node node, int horDist)
        {
            this.node = node;
            this.horDist = horDist;
        }
    }
    
    // Method that returns the bottom view.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> bottomViewList = new ArrayList<>();
        Queue<Bottom> queue = new LinkedList<>();
        queue.add(new Bottom(root, 0));
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        while(!queue.isEmpty())
        {
            Bottom front = queue.remove();
            map.put(front.horDist, front.node.data);
            if(front.node.left != null)
                queue.add(new Bottom(front.node.left, front.horDist-1));
            if(front.node.right != null)
                queue.add(new Bottom(front.node.right, front.horDist+1));
        }
        
        for(Integer v : map.values())
        {
            bottomViewList.add(v);
        }
        return bottomViewList;
    }
}
