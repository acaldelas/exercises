/*
I - Implement an algorithm to find K'th to last element of a linked
list
D - We need to find the the K in the list
E/A: 
1. Small instances:K = 2 1->1->1->2->3
Would need to return 2
2. Write: We take the list and get the size of the list and then calculate 
where K should be
3. Patterns:
We see that we have to loop through the whole list: for loop
Get the K in terms of the loop: arithmitic calc
4.Algorithm:
 We could loop through the list twice, first to get the size
second to get where k is then return it
5.Code
6. Test Cases
1->2->3->4 k = 3
moves to k then moves the next temp in place and returns that value
Tested on Leetcode
7. Debug
Time complexity is O(n)
Space: O(1)
*/
public class ch2findktolast{
    public static void main(String[] args){

    }
    public static int findk(Node head, int k){

	//check if it's null first
	if(head == null || k<0)
	    return -1;
	Node temp = head;
	Node temp2 = head;
	for(int i = 0; i<k;i++){
	    if(temp == null)
		return null;
	    temp = temp.next;
	}
	//move both at the same time
	while(temp !=null){
	    temp = temp.next;
	    temp2 = tem2.next;
	}
	return temp2.value;
    }
