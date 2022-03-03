package stackandqueue;

public class Queue {
	/*
	 * creating object of linked list
	 */
	LinkedList linkedList = new LinkedList();

	/*
	 * creating methord to enque / add at last
	 */
	public void enque(Object data) {
		linkedList.addLast(data);
		displayQueue();
	}

	/*
	 * 
	 * deleting the first value from the stack
	 */
	public void deque() {
		linkedList.deleteFirst();
		displayQueue();
	}

	/*
	 * display the stack or linkedlist
	 */
	public void displayQueue() {
		linkedList.display();
	}

}
