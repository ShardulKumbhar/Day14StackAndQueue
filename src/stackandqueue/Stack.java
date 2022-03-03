package stackandqueue;

public class Stack {

	/*
	 * creating Object
	 */
	LinkedList linkedList = new LinkedList();
	
	/*
	 * calling method through object
	 */
	public void push(Object data) {
		linkedList.addFirst(data);
	}

	/*
	 * calling method to display value in linkedList/stack
	 */
	public void displayStack() {
		linkedList.display();
	}
}


