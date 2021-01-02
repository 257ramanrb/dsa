class Solution{
    
    /*
        Ques: Add two numbers represented by linked lists 
        Link: https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1#
        Hint: Reverse both linked lists; Keep adding nodes and maintain carry.
    */
    
    private static Node reverseLL(Node head)
    {
        Node prev = null, curr = head, next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    static Node addLists(Node first, Node second){
        first = reverseLL(first);
        second = reverseLL(second);
        
        Node head = null;
        int carry = 0;
        
        while(first != null || second != null || carry != 0)
        {
            int sum = carry;
            carry = 0;
            
            if(first != null)
            {
                sum += first.data;
                first = first.next;
            }
            
            if(second != null)
            {
                sum += second.data;
                second = second.next;
            }
                
            if(sum > 9)
            {
                carry = sum/10;
                sum = sum%10;
            }
            
            Node tmp = new Node(sum);
            tmp.next = head;
            head = tmp;
        }
            
        return head;
    }
}
