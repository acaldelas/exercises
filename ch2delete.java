/*
I - Delete middle node implement an algorithm to delete a node in the middle of a linked list given only acces to that node
D - Defien goals: We don't return anthything, we don't have the head so we just connect the data to the next one
E/A
1. Small instance:
a->b-c-d-e-f
c
a-b-d-e-f
2. Write down what you did:
We looked at the next data and changed the pointers
We only need to change the data and the pointer of c since we cannot access the previous to change the next
3. Change node.data to he following data
then replace the next one with the current one
4. same as 3 but in code
we also need to check if anything is null
5. code
6.
a-b-c-d-e-f
1-2-3-4-5-6
7. Debug:
Nothing to debug because the code is just taking the next and assigning itself and pointing to the next next
Learn 
This basically was making our curent node an imposter of the next node by reassigning values
this ran much faster than I thought with O(1) and O(1)
*/

public class ch2delete{
    public static boolean deletnode(Node n){
	//check if it's null of next is null
	if(n == null || n.next = null){
	    return false;
	}
	n.value = n.next.value;
	n.next = n.next.next;
	return true; //means it worked
    }
}
