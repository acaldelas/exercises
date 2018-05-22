/**
   I :
   * Write a program to sort a stack such that the smallest items
   * are on top of stack. You can use an additional temporary stack,
   * but you may not copy the elements into any other data structure
   * (such as array). The stack supports the following operations:
   * push, pop, peek and isEmpty.
   D : 
   * Create a stack to help sort our stack without copying 
   * Use pop push pop and isEmpty
   E/A:
   * Create a temp stack, then we will cycle through the input and pop
   * values form the input and we want the smalled at the bottom 
   * we have to compare for the temp stack. If we have an bigger then pop
   * and push it to the input stack. PUsh the temp val to the temp stack 
   * Return temp stack 
   L:
   This was dificult one to understand I had to get reference to understand but I think I understand
   what was being accomplished from tracing the code. You create a temp stack and hold it as 
   we sort the stack and go back forth with temps sorta like swaps but with stacks
   */
     
public class ch3sortstack{
    public static Stack<Integer> sortStack(Stack<Integer> input) {
	//If input is null
	if (input == null) {
	    return null;
	}
	//Create a temp stack 
	Stack<Integer> tempStack = new Stack<>();
	/* Keep going until input is not empty */
	while (!input.isEmpty()) {
	    /* Pop value from input */
	    int tempValue = input.pop();
	    /* We want smallest one at the bottom. So keep comparing and 
	     * if temp stack has bigger item, pop it and push it to input stack */
	    while (!tempStack.isEmpty() && tempStack.peek() > tempValue) {
		input.push(tempStack.pop());
	    }
	    /* Push temp value to the temp stack */
	    tempStack.push(tempValue);
	}
	return tempStack;
    }

}

}
