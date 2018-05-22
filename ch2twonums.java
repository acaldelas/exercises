/*
I - You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that 1's digit is at the head of the list,
D - Define goals
Make a method that will add the two numbers and return 'sum' linked list
E/A:
1. Small instance: 
(7-1-6) +(5-9-2)
Out: (9-1-2)
2. Write it:
So at element we do addition then we have a carry so we take it and apply it to the next two elments summation 
this is also create a new list of them pointing to each other 
3. Patterns:
Loop through the whole element
Keep track of a carry
do addition then create a Node list connecting them
4. Algorithm:
Check if null
init carry to 0
create new list node
loop till either lists inputted are null
in loop add value to carry
carry will then be mod by to give us the remainder
retrun new list
5. Code
6. Test
(7-1-6) + (5-9-2)
(2-1-9)
7. Debug:
If the last one has a carry over I was not sure if was suppose to make a new one, my code also does the followup I did not do it correctly at first
Learn: 
I learned how to do it backwards from the book I was not sure how else to do it.*/
public class ch2twonums{
	public Node addtwo(Node list, Node list2){
		int carry = 0;
		Node head = new Node();
		Node temp = head;
		while(list!=null || list2!=null){
			if(list!=null){
				carry+=list.value;
				list = list.next;
			}
			if(list2!=null){
				carry+=list2.value;
				list2 = list2.next;
			}
			temp.next = new Node(carry%10);
			temp = temp.next;
			carry/=10;
		}
		return head;
	}
	public static Node findSumBackwardOrder(Node headOfList1, Node headOfList2, int carry) {
		if (headOfList1 == null && headOfList2 == null && carry == 0) {
				return null;
		}										     
		int value = carry;
		if (headOfList1 != null) {
			value += headOfList1.data;
		}
		if (headOfList2 != null) {
			value += headOfList2.data;
		}
		Node result = new Node(value % 10);
		if (headOfList1 != null || headOfList2 != null) {
			Node nextNode = findSumBackwardOrder(headOfList1 == null ? null : headOfList1.next, 
					headOfList2 == null ? null : headOfList2.next, value / 10);
			result.next = nextNode;
		}
		// Return result head 
		return resultHead;
	}
}
										 
																      
