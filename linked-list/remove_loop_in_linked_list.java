    /*
        Ques: Detect and remove the loop from the linked list.
        Link: https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1/?track=md-linkedlist
        Hint: 
                1. Use Floyd's Cycle Detection algorithm (rabbit-tortise theorem)
                2. https://www.youtube.com/watch?v=8NBkGnY5iJ8 
                    => Video for understanding logic
                    => Why rabbit-tortise theorem works?
                    => Why move slow by 1 and fast by 2?
                    => Caution: The final code to remove the loop in LL given in video fails in few test cases.
                       Example: 1 -> 2 -> 3 -> 1
    */
    public static void removeLoop(Node head){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                // Loop detected

                slow = head;
                
                while(slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                // slow = fast => start node of loop
                
                while(fast.next != slow)
                {
                    fast = fast.next;
                }
                
                fast.next = null;
                break;
            }
        }
    }
