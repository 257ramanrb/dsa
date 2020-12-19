    /*
        Ques: Detect whether a loop exists in the linked list or not.
        Link: https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
        Hint: Using "turtle-rabbit" theorem, create two pointers: turtle and rabbit. Point both of them to head at first. Now, turtle moves by one position and rabbit moves by two position. If these two pointers meet at some time then loop exists. If we reach null without any meeting then no loop exists.
    */
    
    // Time: O(N), Space: O(1)
    public static boolean detectLoop(Node head){
        Node slow = head, fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                return true;
        }
        return false;
    }
