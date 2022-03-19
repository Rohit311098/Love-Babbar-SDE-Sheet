1. Iterative Approach-  TC-O(N)  SC-O(1)
  
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node currptr=head;
        Node prevptr=null;
        Node nextptr;
        
        while(currptr!=null)
        {
            nextptr=currptr.next;
            
            currptr.next=prevptr;
            
            prevptr=currptr;
            currptr=nextptr;
        }
        
        head=prevptr;
        
        return head;
    }
}


2.Recursive Approach

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        
        Node newhead=reverseList(head.next);
        
        Node headnext=head.next;
        
        headnext.next=head;
        
        head.next=null;
        
        return newhead;
    }
}
