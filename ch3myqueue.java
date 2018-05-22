/*
  I: Implement a queeue clas which implements queue using two stacks
  D: When creatng queue we need to use stacks instead
  E/A:
  Initialize two stacks, then make my constructors: 
  if no input just make two new stacks
  if my stacks are emptpy I need to return becasue nothin is there
  We peek only from stack2 so move to stack2
  enqueue will use stack push
  create methods to move till stacks are empty
*/

public class ch3myqueue{
    //create stacks
    Stack<Integers> stack1 = null;
    Stack<Integers> stack2 = null;
	
    //construct
    public Myqueue(){
	stack1 = new Stack<>();
	stack2 = new Stack<>();
    }
    //peek and element
    public peek(){
	if(isEmpty()){
	    return;
	}
	if(stack2.isEmpty()){
	    moveStack1to2();
	}
	return stack2.peek();
    }
    //engqueue item from queue
    public void enqueue(T item){
	stack1.push(item);
    }
    // dequeue
    public T dequeue(){
	if(isEmpty()){
	    return;
	}


	if (stack2.isEmpty()) {
	    moveStack1ToStack2();
	}
	/* Pop element from stack 2 */
	return stack2.pop();
    }

    public void display() {
	if (!stack1.isEmpty()) {
	    System.out.println(Arrays.toString(stack1.toArray()));
	}
	if (!stack2.isEmpty()) {
	    System.out.println(Arrays.toString(stack2.toArray()));
	}
    }


    public int size() {
	return stack1.size() + stack2.size();
    }


    public boolean isEmpty() {
	return stack1.isEmpty() && stack2.isEmpty();
    }


    private void moveStack1ToStack2() {
	while (!stack1.isEmpty()) {
	    stack2.push(stack1.pop());
	}
    }

}

}



