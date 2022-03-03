package stackandqueue;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * PROCEDURE
		 * =======================
		 * 1.creating object of queue
		 * 2.calling methord to add (first in first out)
		 * 3. calling method to to display stack
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

	}

}
