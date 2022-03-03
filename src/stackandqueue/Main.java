package stackandqueue;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * PROCEDURE
		 * =======================
		 * 1.creating Object an Oject
		 * 2.Calling method to push value to stack
		 * 3.calling method to display value of stack
		 * ============================= 
		 */
		
		/*
		 * 1.creating Object an Oject
		 */
		Stack stack = new Stack();
		/*
		 * 2.Calling method to push value to stack
		 */
		stack.push(70);
		stack.push(30);
		stack.push(56);
		/*
		 * 3.calling method to display value of stack
		 */
		stack.displayStack();
	}

}
