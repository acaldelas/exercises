import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class ch3stackofplates{

/*
 Identify: 
  Imagine a stack of plates. If the stack gets too high, it might topple.
  Therefore, in real life, we would literally start a new stack when the
  previous stack exceeds some threshold. Implement a data structure,
  SetOfStacks which mimics this. SetOfStacks should be composed of several 
  stacks and should create a new stack once the previous one exceeds capacity.
  SetOfStacks.push() and SetOfStacks.pop() should behave identically to a 
  single stack (that is, pop() should return the same values as it would if
  there were just a single stack.)
  
  FOLLOW UP : Implement a function popAt(int index) which performs a pop
  function on a specific sub-stack.
 Define goals:
   We need push to call push on the last staack in the array of staks
   Make sure array stack isn't at max if it is create a new stack 
E/A:
1. Small instance:
	stack:
		{1,2,4,5,6}
2. Write:
We have to move onto a new stack so we have to manipuilate the push when things are pushed and pop will pop
from the most recent stack
L : When we are at the max we move onto the next stack
		
 */

	//set of stacks
	public static class SetOfStacks {
		List<Stack> stacks = new ArrayList<Stack>();
		int capacity;
    		int stackSize;
    		public SetofStacks(int capacity) {
        		this.capacity = capacity;
        		stackSize = 0;
    		}	
 
    	public void push(int v) {
        	if (stackSize + 1 > stacks.size() * capacity) {
        	    Stack<Integer> newStack = new Stack<Integer>();
        	    newStack.push(v);
        	    stacks.add(newStack);
       		 } else {
            	stacks.get(stacks.size()-1).push(v);
        	}
        	stackSize++;
    	}
 
    	public int pop() {
        	if (stackSize == 0) {
        	    return Integer.MAX_VALUE;
        	}
        	Stack<Integer> stack = stacks.get(stacks.size()-1);
        	stack.pop();
        	if (stack.isEmpty()) {
        	    stacks.remove(stacks.size()-1);
        	}
        	stackSize--;
    	}	
 
    	public int peek() {
        	if (stackSize == 0) {
        	    return Integer.MAX_VALUE;
        	}
        	Stack<Integer> stack = stacks.get(stacks.size()-1);
        	return stack.peek();
    	}
}

}
