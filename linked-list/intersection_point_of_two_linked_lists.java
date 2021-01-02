class Solution
{
    
    /*
        Ques: Given two singly linked lists of size N and M, write a program to get the value of node where two linked lists intersect each other. If they don't, return -1;
        Link: https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
        Hint: 
            Method Using difference of node counts:

            1) Get count of the nodes in the first list, let be len1.
            2) Get count of the nodes in the second list, let be len2.
            3) Get the difference of counts d = abs(len1 – len2)
            4) Now traverse the bigger list from the first node till d nodes so that from here onwards both the lists have equal no of nodes.
            5) Then we can traverse both the lists in parallel till we come across a common node.
    */
    
    // returns length of linked list
    private int length(Node head)
    {
        int len = 0;
        while(head != null)
        {
            len++;
            head = head.next;
        }
        return len;
    }
    
	int intersectPoint(Node head1, Node head2)
	{
        int len1 = length(head1);
        int len2 = length(head2);
         
        // If list1 is bigger, make it equal 
        while(len1 > len2)
        {
            head1 = head1.next;
            len1--;
        }
        
        // If list2 is bigger, make it equal
        while(len2 > len1)
        {
            head2 = head2.next;
            len2--;
        }
        
        // at this point, head1 and head2 point to respective LL's nodes from where the length of LLs are same. 
        while(head1 != null)
        {
            if(head1 == head2)
                return head1.data;
            head1 = head1.next;
            head2 = head2.next;
        }
         
        return -1;
	}
}
