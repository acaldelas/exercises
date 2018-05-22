/*
I Write code to remove duplicates form an unsorted linked list

D We don't need to return anything, just delete a node

E/A:
1.Instances: list 1->1->2->3->\
new list 1->2->3->\
2.Write it: We looked at each position in the list, we kept track if we
already had one then based on that we pointed to the next to the 
next
3.Patterns: To traverse-> while loop
prev node -> for the pointer to the next
set -> store the items in the set
4.Algorithm: So we will store the values in a set within the while
loop, the loop will check if the value is a duplicate or not
5. Code
6. Test cases
1->1->2->3->4
was tested on Leetcode 
7. Debug
The first solution works well, I don't see any corrections
This uses a buffer, to make it without the buffer we would need a 
runner for each position traversing O(n^2) for time complexity
L - Learn:
This required the two possibilities of using a buffer which I could
not figure out by myself but the runner concept comes back again. 

*/
public class 2remove{
    public static void main(String[] args){


    }
    public static void delete(Node n){
	HashSet<integer> set = new HashSet<Integer>();
	//we need to keep track of the prev
	Node prev = null;
	whiel(n!=null){
	    //traverse
	    if(set.contains(n.value)){
		prev.next = n.next;
	    }
	    else{
		set.add(n.value);
		prev = n;
	    }
	    n = n.next;
	}
    }
    public static viod removeNoBuff(Node head){
	if(head ==null){
	    return;
	}
	Node curr = head;
	while(curr!=null){
	    //runner
	    Node runner = curr;
	    //check the runners if we have a duplicate
	    while(runner.next !=null){
		//if we hava duplicate
		if(runner.next.value == curr.value){
		    runner.next = runner.next.next;
		}
		else{
		    //continuer with runner
		    runner = runner.next;
		}
	    }
	    //change the curr for the next runner
	    curr = curr.next;
	}
    }
