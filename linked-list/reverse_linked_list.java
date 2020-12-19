    /*
        Ques: Given a linked list of N nodes. The task is to reverse this list.
        Link: https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
        Hint for recursive method: https://www.geeksforgeeks.org/reverse-a-linked-list/ 
    */
    
    // Iterative approach
    // Time: O(n), Space: O(1)
    Node reverseListIterative(Node head)
    {
        Node prev = null, curr = head, next = null;
        
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    // Simple Recursive approach (modified arguments of method)
    // Time: O(n), Space: O(1)
    Node reverseListSimpleRec(Node head)
    {
        return reverseListRec(head, null);
    }
    
    private Node reverseListRec(Node head, Node prev)
    {
        Node next = head.next;
        head.next = prev;
        if(next == null)
            return head;
        
        return reverseListRec(next, head);
    }
    
    // Recursive
    // Time: O(n), Space: O(1)
    Node reverseList(Node head)
    {
        if(head == null || head.next == null)
            return head;
            
        Node newHead = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        return newHead;
    }
