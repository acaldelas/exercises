/*
I - Identify problem 
Write code to partition a linked list around  value x, sucha that all nodes les than x come before all nodes greater or equal to x
if x is contained within the list, the values of x only ne to be after the elements less than x. 
D - Define goals:
We need to make a list where the smaller numbers of our selection happen to the left and bigger numbers to the left
E/A 
1. Small instance
3-5-8-5-10-2-0 x = 5
3-0-2-10-5-5-8
2.We found our x and position 5 then we made a new list with numbers that are smaller to the left and bigger numbers to the right
3. x is our loop --> for
check if it's not null ->if statement
Store temp nodes -> Nodes
Traverse the list -> while loop
4. We will create two lists of one being less and the other being greater than then at the end connect them together
5.Code
6.Test cases
My test cases failed I am not sure why, but they were test on Leetcode
1-4-3-2-5-2 x = 3
Null
3-5-6-10-2-1 x = 5
Null
7. Debug
I think if I followed the books solution it would work, I am not sure why I end up getting a null for all inputs
Learn:
When I looked up the answer from the book I was confused the sources I used online were in a differnt context but 
the online sources made more sense.  I will have to comeback to this one  


*/
public class ch2partition{
    public Node part(Node head, int x){
	if(head == null)
	    return null;
	Node fakeHead = new Node();
	Node fakeHead2 = new Node();

	fakeHead.next = head;


	Node cur = head;
	Node prev = fakeHead;
	Node prev2 = fakeHead2;

	while(cur!=null){
	    if(cur.value<x){
		cur = cur.next;
		prev = prev.next;
	    }
	    else{
		prev2.next = cur;
		prev.next = cur.next;

		cur = prev.next;
		prev2 = prev2.next;
	    }
	}
	prev2.next = null;
	prev.next = faekHead2.next;

	return fakeHead.next;
    }
}
