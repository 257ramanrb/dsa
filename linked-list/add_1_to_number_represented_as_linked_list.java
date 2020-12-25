/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    private static Node reverseLL(Node head)
    {
        Node prev = null, curr = head;
        
        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    /*
        Ques: A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.
        Link: https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
        Hint: 
            1. Reverse given linked list. For example, 1-> 9-> 9 -> 9 is converted to 9-> 9 -> 9 ->1.
            2. Start traversing linked list from leftmost node and add 1 to it. If there is a carry, move to the next node. Keep moving to the next node while there is a carry.
            3. Reverse modified linked list and return head.
    */
    public static Node addOne(Node head) 
    { 
        head = reverseLL(head);
        int carry = 1;
        
        Node curr = head;
        while(curr.next != null)
        {
            if(curr.data == 9)
                curr.data = 0;
            else
            {
                curr.data++;
                carry = 0;
                break;
            }
            curr = curr.next;
        }
        if(carry == 1)
        {
            if(curr.data == 9)
            {
                curr.data = 0;
                curr.next = new Node(1);
            }else
                curr.data++;
        }
        
        return reverseLL(head);
    }
}
