class Solution
{
    /*
        Ques: Construct Binary Tree from given Inorder and Preorder traversals
        Link: https://practice.geeksforgeeks.org/problems/construct-tree-1/1
    */

    static int preIndex = 0;
    
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        Node root = buildTreeHelper(inorder, preorder, 0, n-1);
        preIndex = 0;
        return root;
    }
    
    public static Node buildTreeHelper(int inorder[], int preorder[], int inS, int inE)
    {
        if(inS > inE)
            return null;
            
        Node root = new Node(preorder[preIndex]);
        
        preIndex++;
        
        if(inS == inE)
            return root;
        
        int index = inS;
        for(int i = inS; i <= inE; i++)
            if(inorder[i] == root.data)
            {
                index = i;
                break;
            }
        
        root.left = buildTreeHelper(inorder, preorder, inS, index-1);
        root.right = buildTreeHelper(inorder, preorder, index+1, inE);
        
        return root;
    }
}
