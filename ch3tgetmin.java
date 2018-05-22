/*
  Identify:
  How would you design a stack which, in addition to push and pop, 
  has a function min() which returns a minimum element? Push, pop 
  and min, all should operate in O(1) time
  Define:
  Give a single value of the Min, define our stack 
  make sure it's in O(1) time
  E/A:
	1. Small Instances: 

		push(5); // stack is {5}, min is 5
		push(6); // stack is {6, 5}, min is 5
		push(3); // stack is {3, 6, 5}, min is 3
		push(7); // stack is {7, 3, 6, 5}, min is 3
		pop(); // pops 7. stack is {3, 6, 5}, min is 3
		pop(); // pops 3. stack is {6, 5}. min is 5.
		min(); // returns the minValue from stack. min is 5
	2. Write:
	   So we pushed then we finally pop then we view into the stack
	   Our stack should already contain the min throughout the 
	   program
	3. Patterns:
		Track main stack
		get the size of the stack or init
		creat stack
		construct an array 
		create push
		create pop		
		create push in min value
	4. Algorithm:
		We will create normal push and pop but then min value
		Min value will look into 
	5. Code
	6. Test cases
	7.Debug: This is not space efficient a large stack will cause us to have a unusually large stack
	
	Learn: I was not sure how to do this problem but I followed the book and it somewhat made sense.
*/
public static class ch3tgetmin {

		Integer[] array;
		int size = 0;
		private Stack<Integer> stackForMinValue = new Stack<>();
\
		public CustomStack(int capacity) {
			array = new Integer[capacity];
		}

		public void push(Integer item) {
			
			if (size == array.length) {
				return;
			}
			
			pushToStackForMinValue(item);
		
			array[size++] = item;
		}


		private void pushToStackForMinValue(Integer item) {
			if (!stackForMinValue.isEmpty()) {
				if (item < stackForMinValue.peek()) {
					stackForMinValue.pop();
					stackForMinValue.push(item);
				}
			} else {
				stackForMinValue.push(item);
			}
		}

		public Integer pop() {
			
			if (size == 0) {
				throw new NoSuchElementException("Cannot pop from empty stack");
			}
			
			Integer result = array[size - 1];
			array[size - 1] = null;
			size--;
			return result;
		}

		
		public int size() {
			return size;
		}
		public Integer min() {
			return stackForMinValue.peek();
		}

	}

}
