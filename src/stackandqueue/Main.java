package stackandqueue;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * PROCEDURE
		 * =======================
		 * 1.creating object of queue
		 * 2.calling methord to add (first in first out)
		 * 3. calling method to to display stack
		 * 4.deque/deleting the top values of stack
		 * ============================= 
		 */

		/*
		 * 1.creating object of queue
		 */
		Queue queue = new Queue();
		/*
		 * 2.calling methord to add (first in first out)
		 */
		queue.enque(56);
		queue.enque(30);
		queue.enque(70);
		/*
		 * 3. calling method to to display stack
		 */
		queue.displayQueue();

		/*
		 * 4.deque/deleting the top values of stack
		 * 56(top value)
		 * 30(second top)
		 * 70(last value)
		 * after deleting the stack is empty
		 * 
		 */
		queue.deque();
		queue.deque();
		queue.deque();
		
	}

}
