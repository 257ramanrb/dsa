/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class View
{
    /*
        Ques: Print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

                       1
                    /     \
                   2       3
                  /  \    /   \
                 4    5  6     7

              Top view will be: 4 2 1 3 7
              Note: Print from leftmost node to rightmost node.
        Link: https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
        Hint: Use Level Order Traversal with Horizontal Distance
    */
    
    static class Top
    {
        Node node;
        int horDist;
        
        Top(Node node, int horDist)
        {
            this.node = node;
            this.horDist = horDist;
        }
    }
    
    // prints the topView of the binary tree
    static void topView(Node root)
    {
        Queue<Top> queue = new LinkedList<>();
        queue.add(new Top(root, 0));
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        while(queue.isEmpty())
        {
            Top front = queue.remove();
            if(map.get(front.horDist) == null)
                map.put(front.horDist, front.node.data);
            if(front.node.left != null)
                queue.add(new Top(front.node.left, front.horDist-1));
            if(front.node.right != null)
                queue.add(new Top(front.node.right, front.horDist+1));
        }
        
        for(Integer v : map.values())
        {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
